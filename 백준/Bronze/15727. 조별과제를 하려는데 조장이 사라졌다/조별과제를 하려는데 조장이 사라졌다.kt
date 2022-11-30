import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val l = StringTokenizer(readLine()).nextToken().toInt()

    if (l % 5 == 0) {
        println(l / 5)
    } else {
        println(l / 5 + 1)
    }
}