class Solution {
    fun solution(citations: IntArray): Int {
        return citations.sortedDescending().mapIndexed { idx, it -> minOf(idx + 1, it) }.sorted().last()
    }
}