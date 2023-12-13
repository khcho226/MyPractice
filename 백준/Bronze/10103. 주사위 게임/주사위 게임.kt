import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var scoreA = 100
    var scoreB = 100

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        if (a < b) {
            scoreA -= b
        } else if (a > b) {
            scoreB -= a
        }
    }

    print("$scoreA\n$scoreB")
}