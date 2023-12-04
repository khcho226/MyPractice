import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    var stats = 0

    repeat(4) {
        stats += token.nextToken().toInt()
    }

    print(maxOf(token.nextToken().toInt() * 4 - stats, 0))
}