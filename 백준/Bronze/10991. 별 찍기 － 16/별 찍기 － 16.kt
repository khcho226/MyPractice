fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val answer = StringBuilder()

    for (i in 1..n) {
        repeat(n - i) {
            answer.append(" ")
        }

        repeat(i) {
            answer.append("* ")
        }

        answer.append("\n")
    }

    print(answer)
}