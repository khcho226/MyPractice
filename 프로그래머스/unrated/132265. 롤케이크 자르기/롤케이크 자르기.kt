class Solution {
    fun solution(topping: IntArray): Int {
        val mapA = topping.groupBy { it }.mapValues { it.value.size }.toMutableMap()
        val mapB = mutableMapOf<Int, Int>()
        var answer = 0

        for (i in topping) {
            mapA[i] = mapA.getOrDefault(i, 0) - 1
            mapB[i] = mapB.getOrDefault(i, 0) + 1

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