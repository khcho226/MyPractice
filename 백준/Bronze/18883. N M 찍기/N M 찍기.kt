import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val answer = StringBuilder()
    var num = 1

    repeat(n) {
        repeat(m - 1) {
            answer.append("${num++} ")
        }

        answer.append("${num++}\n")
    }

    print(answer)
}