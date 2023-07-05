class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val termsMap = terms.associate { it.split(" ")[0] to it.split(" ")[1].toInt() }
        val todayTime = calculateTime(today)
        var answer = intArrayOf()

        privacies.forEachIndexed { idx, it ->
            it.split(" ").also { it2 ->
                if (calculateTime(it2[0]) + termsMap[it2[1]]!! * 28 <= todayTime) {
                    answer = answer.plus(idx + 1)
                }
            }
        }

        return answer
    }

    fun calculateTime(day: String): Int {
        var sum = 0

        day.split(".").also {
            sum += it[0].toInt() * 28 * 12
            sum += it[1].toInt() * 28
            sum += it[2].toInt()
        }

        return sum
    }
}