fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val answer = StringBuilder()

    for (i in 1..n) {
        repeat(n - i) {
            answer.append(" ")
        }

        if (i != 1) {
            answer.append("*")

            repeat(2 * i - 3) {
                answer.append(
                    if (i == n) {
                        "*"
                    } else {
                        " "
                    }
                )
            }
        }

        answer.append("*\n")
    }

    print(answer)
}