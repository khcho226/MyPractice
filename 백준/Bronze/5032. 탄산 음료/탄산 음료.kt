import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    var total = a + b
    var cnt = 0

    while (total >= c) {
        val d = total / c
        val e = total % c

        total = d + e
        cnt += d
    }

    println(cnt)
}