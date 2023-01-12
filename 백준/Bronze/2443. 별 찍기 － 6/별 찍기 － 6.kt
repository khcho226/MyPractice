import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n) {
        repeat(it) { answer.append(" ") }
        repeat(2 * (n - it) - 1) { answer.append("*") }
        answer.append("\n")
    }
    print(answer)
}