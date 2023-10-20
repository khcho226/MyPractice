import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val candy = StringTokenizer(readLine())
        val n = token.nextToken().toInt()
        val k = token.nextToken().toInt()
        var cnt = 0

        repeat(n) {
            cnt += candy.nextToken().toInt() / k
        }

        answer.append("$cnt\n")
    }

    print(answer)
}