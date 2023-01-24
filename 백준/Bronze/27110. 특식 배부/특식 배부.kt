import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var answer = 0

    repeat(3) {
        val num = token.nextToken().toInt()

        answer += if (n < num) {
            n
        } else {
            num
        }
    }
    print(answer)
}