class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        val sortedScore = score.sortedDescending()
        var answer = 0
        var idx = m - 1
        
        while (idx < score.size) {
            answer += m * sortedScore[idx]
            idx += m
        }
        
        return answer
    }
}