import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().apply {
            answer.append("${this.first().uppercase()}${this.substring(1)}\n")
        }
    }
    print(answer)
}
