import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    var num = n
    var total = 0

    while (num > 0) {
        total += num
        num /= m
    }

    print(total)
}