fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    readLine().toInt().also { n ->
        repeat(4 * n) {
            repeat(n) {
                answer.append("@")
            }

            answer.append("\n")
        }

        repeat(n) {
            repeat(5 * n) {
                answer.append("@")
            }

            answer.append("\n")
        }
    }

    print(answer)
}