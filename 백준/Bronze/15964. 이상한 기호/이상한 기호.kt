import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toLong()
    val b = token.nextToken().toLong()

    println((a + b) * (a - b))
}