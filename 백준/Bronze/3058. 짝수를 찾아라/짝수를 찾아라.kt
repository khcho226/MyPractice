import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n) {
        val token = StringTokenizer(readLine())
        var sum = 0
        var min = 100

        repeat(7) {
            val temp = token.nextToken().toInt()

            if (temp % 2 == 0) {
                sum += temp
                min = minOf(min, temp)
            }
        }
        answer.append("$sum ${min}\n")
    }
    print(answer)
}