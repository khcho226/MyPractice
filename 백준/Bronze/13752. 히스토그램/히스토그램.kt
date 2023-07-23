fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        repeat(readLine().toInt()) {
            answer.append("=")
        }

        answer.append("\n")
    }

    print(answer)
}