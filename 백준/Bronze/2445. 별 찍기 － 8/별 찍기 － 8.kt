import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n - 1) { i ->
        repeat(2 * n) {
            if (i + 1 <= it && it <= 2 * (n - 1) - i) {
                answer.append(" ")
            } else {
                answer.append("*")
            }
        }
        answer.append("\n")
    }
    repeat(n) { i ->
        repeat(2 * n) {
            if (n - i <= it && it <= n + i - 1) {
                answer.append(" ")
            } else {
                answer.append("*")
            }
        }
        answer.append("\n")
    }
    print(answer)
}