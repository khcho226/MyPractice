class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val groupedTangerine = tangerine.groupBy { it }.mapValues { it.value.size }
        val sortedTangerine = groupedTangerine.toList().sortedByDescending { it.second }
        var answer = 0
        var total = 0

        return sortedTangerine.takeWhile {
            answer++
            total += it.second
            total < k
        }.size + 1
    }
}