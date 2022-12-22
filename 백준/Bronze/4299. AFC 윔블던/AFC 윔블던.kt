import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    if (a < b || (a + b) % 2 != 0) {
        print(-1)
    } else {
        print("${(a + b) / 2} ${(a - b) / 2}")
    }
}