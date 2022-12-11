import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    token = StringTokenizer(readLine())

    val c = token.nextToken().toInt()
    val d = token.nextToken().toInt()

    print(minOf(a + d, b + c))
}