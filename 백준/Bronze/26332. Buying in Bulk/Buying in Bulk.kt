import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val c = token.nextToken().toInt()
        val p = token.nextToken().toInt()

        answer.append("$c $p\n${c * (p - 2) + 2}\n")
    }

    print(answer)
}