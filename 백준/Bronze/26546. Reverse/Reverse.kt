import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val s = token.nextToken()
        val i = token.nextToken().toInt()
        val j = token.nextToken().toInt()

        answer.append("${s.removeRange(i, j)}\n")
    }

    print(answer)
}