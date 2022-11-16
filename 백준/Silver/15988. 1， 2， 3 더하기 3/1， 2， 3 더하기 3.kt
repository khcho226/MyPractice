import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val dp = IntArray(1000000)

    dp[0] = 1
    dp[1] = 2
    dp[2] = 4

    for (i in 3..999999) {
        dp[i] = ((dp[i - 3].toLong() + dp[i - 2] + dp[i - 1]) % 1000000009).toInt()
    }

    var token = StringTokenizer(readLine())
    val answer = StringBuilder()

    repeat(token.nextToken().toInt()) {
        token = StringTokenizer(readLine())
        answer.append("${dp[token.nextToken().toInt() - 1]}\n")
    }

    println(answer)
}