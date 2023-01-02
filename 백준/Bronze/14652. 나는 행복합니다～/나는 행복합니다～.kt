import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    print("${k / m} ${k % m}")
}