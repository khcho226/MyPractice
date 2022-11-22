import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val dp = Array(n + 1) { IntArray(k + 1) }

    for (i in 1..n) {
        token = StringTokenizer(readLine())

        val w = token.nextToken().toInt()
        val v = token.nextToken().toInt()

        for (j in 1..k) {
            dp[i][j] = if (j < w) {
                dp[i - 1][j]
            } else {
                maxOf(dp[i - 1][j], dp[i - 1][j - w] + v)
            }
        }
    }

    println(dp[n][k])
}