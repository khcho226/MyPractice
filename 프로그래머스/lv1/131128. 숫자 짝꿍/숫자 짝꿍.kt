class Solution {
    fun solution(X: String, Y: String): String {
        val arrX = IntArray(10).apply { X.forEach { this[it - '0'] += 1 }}
        val arrY = IntArray(10).apply { Y.forEach { this[it - '0'] += 1 }}
        val answer = StringBuilder()

        for (i in 9 downTo 0) {
            repeat(minOf(arrX[i], arrY[i])) {
                answer.append(i.toString())
            }
        }

        return if (answer.isEmpty()) {
            "-1"
        } else if (answer.length == answer.count { it == '0' }) {
            "0"
        } else {
            answer.toString()
        }
    }
}