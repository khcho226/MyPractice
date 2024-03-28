class Solution {
    fun solution(my_string: String, n: Int): String {
        var ans = ""
        
        my_string.forEach { c ->
            repeat(n) {
                ans += c
            }
        }
        
        return ans
    }
}