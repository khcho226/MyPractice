import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        answer.append(
            if (n >= 12 && m >= 4) {
                "${m * 11 + 4}\n"
            } else {
                "-1\n"
            }
        )
    }

    print(answer)
}