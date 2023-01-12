import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n) {
        repeat(n - it - 1) { answer.append(" ") }
        repeat(2 * it + 1) { answer.append("*") }
        answer.append("\n")
    }
    print(answer)
}