import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) { answer.append("Hello World, Judge ${it + 1}!\n") }
    print(answer)
}