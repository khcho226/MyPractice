import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val arr = arrayListOf<String>()

        while (token.hasMoreTokens()) {
            arr.add(token.nextToken())
        }

        answer.append("Case #${it + 1}: ${arr.reversed().joinToString(" ")}\n")
    }

    print(answer)
}