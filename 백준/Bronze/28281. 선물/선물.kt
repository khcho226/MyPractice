import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val x = token.nextToken().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    var total = 2000

    for (i in 1 until n) {
        total = minOf(total, arr[i - 1] + arr[i])
    }

    print(x * total)
}