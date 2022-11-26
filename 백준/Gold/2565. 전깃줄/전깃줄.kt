import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val arr = mutableListOf<Pair<Int, Int>>()

    repeat(n) {
        token = StringTokenizer(readLine())
        arr.add(Pair(token.nextToken().toInt(), token.nextToken().toInt()))
    }

    arr.sortBy { it.first }
    
    val dp = IntArray(n)

    for (i in 0 until n) {
        dp[i] = 1

        for (j in 0 until i) {
            if (arr[i].second > arr[j].second) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }

    println(n - dp.maxOrNull()!!)
}

