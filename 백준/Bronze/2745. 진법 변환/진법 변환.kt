import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken()
    val b = token.nextToken().toInt()

    print(n.toBigInteger(b))
}