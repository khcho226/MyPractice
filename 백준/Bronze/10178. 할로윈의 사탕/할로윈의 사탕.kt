import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        answer.append("You get ${n / m} piece(s) and your dad gets ${n % m} piece(s).\n")
    }

    print(answer)
}