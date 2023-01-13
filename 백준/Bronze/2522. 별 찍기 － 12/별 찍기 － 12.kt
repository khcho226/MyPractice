import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n - 1) {
        repeat(n - it - 1) { answer.append(" ") }
        repeat(it + 1) { answer.append("*") }
        answer.append("\n")
    }
    repeat(n) {
        repeat(it) { answer.append(" ") }
        repeat(n - it) { answer.append("*") }
        answer.append("\n")
    }
    print(answer)
}