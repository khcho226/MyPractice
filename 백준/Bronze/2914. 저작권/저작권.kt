import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val i = token.nextToken().toInt()

    print(a * (i - 1) + 1)
}