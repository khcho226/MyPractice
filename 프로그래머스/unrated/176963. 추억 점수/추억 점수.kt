class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer = intArrayOf()

        photo.forEach {
            var total = 0

            it.forEach { it2 ->
                val idx = name.indexOf(it2)

                if (idx >= 0) {
                    total += yearning[idx]
                }
            }
            answer = answer.plus(total)
        }

        return answer
    }
}