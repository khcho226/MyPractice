class Solution {
    fun solution(str1: String, str2: String): String {
        var ans = ""
        
        str2.forEachIndexed { idx, it ->
            ans += "${str1[idx]}$it"
        }
        
        return ans
    }
}