import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var sum = 0
    var score = 0

    repeat(n) {
        if (token.nextToken().toInt() == 1) {
            score++
            sum += score
        } else {
            score = 0
        }
    }
    print(sum)
}