import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(StringTokenizer(readLine()).nextToken().toInt()) {
        val word = StringTokenizer(readLine()).nextToken().toString()

        answer.append("${word.first()}${word.last()}\n")
    }

    println(answer)
}