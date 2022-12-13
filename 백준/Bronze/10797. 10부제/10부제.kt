import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var ans = 0
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()

    token = StringTokenizer(readLine())
    repeat(5) {
        if (token.nextToken().toInt() == n) {
            ans++
        }
    }
    print(ans)
}