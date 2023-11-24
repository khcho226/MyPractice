import kotlin.math.*

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val inArr = IntArray(10000) { -1 }
        val totalArr = IntArray(10000)

        records.forEach {
            val record = it.split(" ")

            if (record[2] == "IN") {
                inArr[record[1].toInt()] = calcTime(record[0].split(":"))
            } else {
                totalArr[record[1].toInt()] += calcTime(record[0].split(":")) - inArr[record[1].toInt()]
                inArr[record[1].toInt()] = -1
            }
        }

        inArr.forEachIndexed { idx, i ->
            if (i != -1) {
                totalArr[idx] += 1439 - i
            }
        }

        return totalArr.filter { it != 0 }.map { calcFee(fees, it) }.toIntArray()
    }

    fun calcTime(lst: List<String>): Int {
        return lst[0].toInt() * 60 + lst[1].toInt()
    }

    fun calcFee(fees: IntArray, num: Int): Int {
        var total = fees[1]

        (num - fees[0]).also {
            if (it > 0) {
                total += ceil(it.toDouble() / fees[2]).toInt() * fees[3]
            }
        }

        return total
    }
}