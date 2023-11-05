fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    readLine().toInt().also { n ->
        repeat(n + 2) {
            answer.append("@")
        }

        answer.append("\n")

        repeat(n) {
            answer.append("@")

            repeat(n) {
                answer.append(" ")
            }

            answer.append("@\n")
        }

        repeat(n + 2) {
            answer.append("@")
        }
    }

    print(answer)
}