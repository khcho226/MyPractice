class Solution {
    fun solution(myString: String): String {
        var ans = ""
        
        myString.forEach {
            if (it == 'A' || it == 'a') {
                ans += 'A'
            } else {
                ans += it.lowercase()
            }
        }
        
        return ans
    }
}