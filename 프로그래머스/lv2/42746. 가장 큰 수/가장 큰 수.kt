class Solution {
    fun solution(numbers: IntArray): String {
        val ans = numbers.sortedByDescending { number ->   
            number.toString().let { token ->
                token.plus(token).plus(token)
            }
        }.joinToString("")
        
        return if (ans[0] == '0') {
            "0"
        } else {
            ans
        }
    }
}