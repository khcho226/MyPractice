class Solution {
    fun solution(num_list: IntArray): IntArray {
        var cnt1 = 0
        var cnt2 = 0
        
        num_list.forEach {
            if (it % 2 == 0) {
                cnt1++
            } else {
                cnt2++
            }
        } 
        
        return intArrayOf(cnt1, cnt2)
    }
}