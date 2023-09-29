import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val x = token.nextToken().toInt()

        answer.append("${a * (x - 1) + b}\n")
    }

    print(answer)
}