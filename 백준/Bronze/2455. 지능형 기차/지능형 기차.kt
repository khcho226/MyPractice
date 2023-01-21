import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var max = 0
    var num = 0

    repeat(4) {
        val token = StringTokenizer(readLine())
        val numOut = token.nextToken().toInt()
        val numIn = token.nextToken().toInt()

        num += numIn - numOut
        max = maxOf(max, num)
    }
    print(max)
}