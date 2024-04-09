class Solution {
    fun solution(rsp: String): String {
        var ans = ""
        
        rsp.forEach {
            ans += when (it) {
                '0' -> '5'
                '2' -> '0'
                else -> '2'
            }
        }
        
        return ans
    }
}