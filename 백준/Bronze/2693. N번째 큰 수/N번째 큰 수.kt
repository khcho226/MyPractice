import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) { answer.append("${readLine().split(" ").map { it.toInt() }.sorted()[7]}\n") }
    print(answer)
}