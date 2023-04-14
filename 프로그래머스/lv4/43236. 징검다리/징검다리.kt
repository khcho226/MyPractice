class Solution {
    fun solution(distance: Int, rocks: IntArray, n: Int): Int {
        val rock = rocks.sorted()
        var answer = 0
        var left = 1
        var right = distance - rock.first()
        
        while (left <= right) {
            val mid = (left + right) / 2
            var now = 0
            var cnt = 0
            
            for (i in rocks.indices) {
                if (rock[i] - now < mid) {
                    cnt++
                    
                    if (cnt > n) {
                        break
                    }
                } else {
                    now = rock[i]
                }
            }
            
            if (cnt > n) {
                right = mid - 1
            } else {
                answer = mid
                left = mid + 1
            }
        }
        
        return answer
    }
}