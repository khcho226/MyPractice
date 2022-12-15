class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val list = priorities.withIndex().toMutableList()
        var cnt = 0
        
        while (list.isNotEmpty()) {
            val now = list.removeAt(0)
            
            if (list.any { now.value < it.value }) {
                list.add(now)
            } else {
                cnt++
                
                if (now.index == location) {
                    break
                }
            }
        }
        
        return cnt
    }
}