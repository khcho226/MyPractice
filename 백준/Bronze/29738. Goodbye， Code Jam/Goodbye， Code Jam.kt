fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) { i ->
        readLine().toInt().also {
            answer.append(
                when {
                    it > 4500 -> "Case #${i + 1}: Round 1\n"
                    it > 1000 -> "Case #${i + 1}: Round 2\n"
                    it > 25 -> "Case #${i + 1}: Round 3\n"
                    else -> "Case #${i + 1}: World Finals\n"
                }
            )
        }
    }

    print(answer)
}