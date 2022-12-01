import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    if (a * (100 - b) >= 10000) {
        println(0)
    } else {
        println(1)
    }
}