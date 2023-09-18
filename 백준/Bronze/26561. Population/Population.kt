import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val p = token.nextToken().toInt()
        val t = token.nextToken().toInt()

        answer.append("${p + t / 4 - t / 7}\n")
    }

    print(answer)
}