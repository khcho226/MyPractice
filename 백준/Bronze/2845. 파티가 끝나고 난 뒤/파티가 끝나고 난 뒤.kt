import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt() * token.nextToken().toInt()

    token = StringTokenizer(readLine())
    repeat(5) { print("${token.nextToken().toInt() - n} ") }
}