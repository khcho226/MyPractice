import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val x = token.nextToken().toInt()
    var y = token.nextToken().toInt()
    val month = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val day = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")

    repeat(x - 1) { y += month[it] }
    println(day[y % 7])
}