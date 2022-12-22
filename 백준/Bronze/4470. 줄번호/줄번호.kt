import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) { answer.append("${it + 1}. ${readLine()}\n") }
    print(answer)
}