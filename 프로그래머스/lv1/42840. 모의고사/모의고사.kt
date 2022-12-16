class Solution {
    fun solution(answers: IntArray): IntArray {
        return arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)           
        ).map {
            var score = 0

            answers.forEachIndexed { idx, answer ->
                if (it[idx % it.size] == answer) {
                    score++
                }
            }
            score
        }.let { arr ->
            arr.withIndex()
                .filter { it.value == arr.maxOrNull() }
                .map { it.index + 1 }
                .toIntArray()
        }
    }
}