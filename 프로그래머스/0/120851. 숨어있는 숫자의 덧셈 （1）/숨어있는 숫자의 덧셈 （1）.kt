class Solution {
    fun solution(my_string: String): Int {
        var total = 0
        
        my_string.forEach {
            if (it.isDigit()) {
                total += it - '0'
            }
        }
        
        return total
    }
}