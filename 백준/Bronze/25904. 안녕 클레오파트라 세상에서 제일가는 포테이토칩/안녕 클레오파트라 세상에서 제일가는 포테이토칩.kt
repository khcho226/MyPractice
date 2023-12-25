import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val x = token.nextToken().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    var idx = 0
    var now = x

    while (true) {
        if (arr[idx] < now) {
            print(idx + 1)
            break
        }

        idx = (idx + 1) % n
        now++
    }
}