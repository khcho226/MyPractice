import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { IntArray(n + 1) }
    var profit = -1000

    for (r in 1..n) {
        val token = StringTokenizer(readLine())

        for (c in 1..n) {
            arr[r][c] = token.nextToken().toInt() + arr[r - 1][c] + arr[r][c - 1] - arr[r - 1][c - 1]
        }
    }

    for (k in 1..n) {
        for (r in k..n) {
            for (c in k..n) {
                profit = profit.coerceAtLeast(arr[r][c] + arr[r - k][c - k] - arr[r - k][c] - arr[r][c - k])
            }
        }
    }

    println(profit)
}