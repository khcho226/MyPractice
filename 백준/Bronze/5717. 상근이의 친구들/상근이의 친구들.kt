import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    while (true) {
        val token = StringTokenizer(readLine())
        val m = token.nextToken().toInt()
        val f = token.nextToken().toInt()

        if (m == 0 && f == 0) {
            break
        }

        answer.append("${m + f}\n")
    }

    print(answer)
}