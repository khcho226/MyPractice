fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    readLine().toInt().also { n ->
        repeat(n) {
            repeat(n) {
                answer.append("@")
            }

            repeat(3 * n) {
                answer.append(" ")
            }

            repeat(n) {
                answer.append("@")
            }

            answer.append("\n")
        }

        repeat(n) {
            repeat(n) {
                answer.append("@")
            }

            repeat(2 * n) {
                answer.append(" ")
            }

            repeat(n) {
                answer.append("@")
            }

            answer.append("\n")
        }

        repeat(n) {
            repeat(3 * n) {
                answer.append("@")
            }

            answer.append("\n")
        }

        repeat(n) {
            repeat(n) {
                answer.append("@")
            }

            repeat(2 * n) {
                answer.append(" ")
            }

            repeat(n) {
                answer.append("@")
            }

            answer.append("\n")
        }

        repeat(n) {
            repeat(n) {
                answer.append("@")
            }

            repeat(3 * n) {
                answer.append(" ")
            }

            repeat(n) {
                answer.append("@")
            }

            answer.append("\n")
        }
    }

    print(answer)
}