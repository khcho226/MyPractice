import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())

    print(minOf(token.nextToken().toInt(), token.nextToken().toInt()) / 2)
}