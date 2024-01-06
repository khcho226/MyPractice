class Solution {
    fun solution(distance: Int, rocks: IntArray, n: Int): Int {
        val rock = rocks.sorted().plus(distance)
        var l = 1
        var r = distance

        while (l <= r) {
            val mid = (l + r) / 2
            var now = 0
            var cnt = 0
            
            rock.forEach {
                if (it - now < mid) {
                    cnt++
                } else {
                    now = it
                }
            }

            if (cnt <= n) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }

        return r
    }
}