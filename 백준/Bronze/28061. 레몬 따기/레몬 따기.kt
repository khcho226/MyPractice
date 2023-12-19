import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var max = 0

    for (i in 0 until n) {
        max = maxOf(max, token.nextToken().toInt() + i - n)
    }

    print(max)
}