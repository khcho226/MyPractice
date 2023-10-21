import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val v = token.nextToken().toInt()
        val e = token.nextToken().toInt()

        answer.append("${2 - v + e}\n")
    }

    print(answer)
}