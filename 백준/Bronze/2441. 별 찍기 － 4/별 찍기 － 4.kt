import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n) {
        repeat(it) { answer.append(" ") }
        repeat(n - it) { answer.append("*") }
        answer.append("\n")
    }
    print(answer)
}