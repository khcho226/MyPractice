class Solution {
    fun solution(num_list: IntArray): Int {
        num_list.forEachIndexed { idx, num ->
            if (num < 0) {
                return idx
            }
        }
        
        return -1
    }
}