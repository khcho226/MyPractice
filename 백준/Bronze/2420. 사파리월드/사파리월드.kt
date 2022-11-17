import java.io.*
import java.util.*
import kotlin.math.abs

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toLong()
    val m = token.nextToken().toLong()

    println(abs(n - m))
}