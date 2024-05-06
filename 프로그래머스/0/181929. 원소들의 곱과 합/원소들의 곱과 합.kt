class Solution {
    fun solution(num_list: IntArray): Int {
        var n1 = 1
        var n2 = 0
        
        num_list.forEach {
            n1 *= it
            n2 += it
        }
        
        return if (n1 < n2 * n2) {
            1
        } else {
            0
        }
    }
}