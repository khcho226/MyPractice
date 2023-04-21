class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var idx = 0
        var answer = 0
        
        section.forEach {
            if (idx < it) {
                idx = it + m - 1
                answer++
            }
        }
        
        return answer
    }
}