import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toString()
    val b = token.nextToken().toString()
    val minA = a.replace("6", "5").toInt()
    val minB = b.replace("6", "5").toInt()
    val maxA = a.replace("5", "6").toInt()
    val maxB = b.replace("5", "6").toInt()

    print("${minA + minB} ${maxA + maxB}")
}