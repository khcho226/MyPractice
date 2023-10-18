fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val answer = StringBuilder()

    for (i in 1..n) {
        if (i % 2 == 0) {
            answer.append(" ")
        }

        repeat(n) {
            answer.append("* ")
        }

        answer.append("\n")
    }

    print(answer)
}