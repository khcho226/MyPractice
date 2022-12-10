import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val ans = token.nextToken().toInt() * token.nextToken().toInt() - token.nextToken().toInt()

    if (ans > 0) {
        print(ans)
    } else {
        print(0)
    }
}