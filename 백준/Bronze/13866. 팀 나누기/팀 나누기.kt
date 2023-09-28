import java.util.*
import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    val d = token.nextToken().toInt()

    print(abs(a - b - c + d))
}