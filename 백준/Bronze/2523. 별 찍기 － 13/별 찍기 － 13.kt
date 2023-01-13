import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n - 1) {
        repeat(it + 1) { answer.append("*") }
        answer.append("\n")
    }
    repeat(n) {
        repeat(n - it) { answer.append("*") }
        answer.append("\n")
    }
    print(answer)
}