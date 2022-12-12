import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val r = token.nextToken().toLong()
    val c = token.nextToken().toLong()
    val n = token.nextToken().toLong()

    print(((r + n - 1) / n) * ((c + n - 1) / n))
}