import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val r = token.nextToken().toInt()
    val s = token.nextToken().toInt()

    print(2 * s - r)
}