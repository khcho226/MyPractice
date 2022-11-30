import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val l = StringTokenizer(readLine()).nextToken().toInt()

    println((l + 4) / 5)
}