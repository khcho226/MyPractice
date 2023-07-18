class Solution {
    fun solution(topping: IntArray): Int {
        val mapA = topping.groupBy { it }.mapValues { it.value.size }.toMutableMap()
        val mapB = mutableMapOf<Int, Int>()
        var answer = 0

        for (i in topping) {
            if (i in mapB) {
                mapB[i] = mapB[i]!! + 1
            } else {
                mapB[i] = 1
            }

            mapA[i] = mapA[i]!! - 1

            if (mapA[i] == 0) {
                mapA.remove(i)
            }

            if (mapA.size == mapB.size) {
                answer++
            }
        }

        return answer
    }
}