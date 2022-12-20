import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var time = 0

    repeat(4) { time += StringTokenizer(readLine()).nextToken().toInt() }
    print("${time / 60}\n${time % 60}")
}