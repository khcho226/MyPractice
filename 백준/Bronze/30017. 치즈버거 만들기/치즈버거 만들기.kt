import java.util.*
import kotlin.math.*

fun main(): Unit = with(System.`in`.bufferedReader()) {
    StringTokenizer(readLine()).also {
        print(min(it.nextToken().toInt(), it.nextToken().toInt() + 1) * 2 - 1)
    }
}