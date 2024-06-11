class Solution {
    fun solution(num_list: IntArray): Int {
        var sum1 = 0
        var sum2 = 0
        
        num_list.forEachIndexed { idx, it ->
            if (idx % 2 == 1) {
                sum1 += it
            } else {
                sum2 += it
            }
        }
        
        return maxOf(sum1, sum2)
    }
}