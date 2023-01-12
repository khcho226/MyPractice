import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n - 1) {
        repeat(it) { answer.append(" ") }
        repeat(2 * (n - it) - 1) { answer.append("*") }
        answer.append("\n")
    }
    repeat(n) {
        repeat(n - it - 1) { answer.append(" ") }
        repeat(2 * it + 1) { answer.append("*") }
        answer.append("\n")
    }
    print(answer)
}