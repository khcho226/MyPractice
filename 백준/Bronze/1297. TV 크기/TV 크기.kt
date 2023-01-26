import java.io.*
import java.util.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val d = token.nextToken().toDouble()
    val h = token.nextToken().toDouble()
    val w = token.nextToken().toDouble()
    val ratio = sqrt(d.pow(2) / (h.pow(2) + w.pow(2)))

    print("${floor(ratio * h).toInt()} ${floor(ratio * w).toInt()}")
}