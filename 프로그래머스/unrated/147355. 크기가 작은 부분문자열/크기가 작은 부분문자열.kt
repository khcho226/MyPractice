class Solution {
    fun solution(t: String, p: String): Int {
        var answer = 0
        
        repeat(t.length - p.length + 1) {            
            if (t.substring(it, it + p.length) <= p) {
                answer++
            }
        }
        
        return answer
    }
}