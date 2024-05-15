class Solution {
    fun solution(num_list: IntArray): Int {
        var num1 = ""
        var num2 = ""
        
        num_list.forEach {
            if (it % 2 == 1) {
                num1 += it.toString()
            } else {
                num2 += it.toString()
            }
        }
        
        return num1.toInt() + num2.toInt()
    }
}