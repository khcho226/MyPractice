import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val r = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    for (i in 1..b) {
        if (b % i == 0 && 2 * (b / i + i + 2) == r) {
            print("${b / i + 2} ${i + 2}")
            break
        }
    }
}