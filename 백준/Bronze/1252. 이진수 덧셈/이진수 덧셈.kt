import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toBigInteger(2)
    val b = token.nextToken().toBigInteger(2)

    print((a + b).toString(2))
}