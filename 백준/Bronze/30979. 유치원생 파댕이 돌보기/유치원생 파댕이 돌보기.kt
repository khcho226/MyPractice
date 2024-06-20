import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val t = readLine().toInt()
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var total = 0

    repeat(n) {
        total += token.nextToken().toInt()

        if (total >= t) {
            print("Padaeng_i Happy")
            return
        }
    }

    print("Padaeng_i Cry")
}