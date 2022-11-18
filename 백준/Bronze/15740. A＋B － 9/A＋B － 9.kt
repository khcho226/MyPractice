import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val x = token.nextToken().toBigInteger()
    val y = token.nextToken().toBigInteger()

    println(x + y)
}