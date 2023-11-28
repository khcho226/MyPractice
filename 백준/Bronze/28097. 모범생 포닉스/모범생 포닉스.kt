import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var total = (n - 1) * 8

    repeat(n) { total += token.nextToken().toInt() }
    print("${total / 24} ${total % 24}")
}