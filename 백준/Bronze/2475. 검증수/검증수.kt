import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    var sum = 0

    repeat(5) {
        val temp = token.nextToken().toInt()

        sum += temp * temp
    }
    println(sum % 10)
}