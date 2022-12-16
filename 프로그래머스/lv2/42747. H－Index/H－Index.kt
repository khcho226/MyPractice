class Solution {
    fun solution(citations: IntArray): Int {
        citations.sorted().forEachIndexed { idx, it ->
            if (it >= citations.size - idx) {
                return citations.size - idx
            }
        }
        
        return 0
    }
}