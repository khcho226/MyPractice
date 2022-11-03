import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val que = (1..n).toMutableList()
    val answer = mutableListOf<Int>()

    while (que.isNotEmpty()) {
        repeat(k - 1) { que.add(que.removeAt(0)) }
        answer.add(que.removeAt(0))
    }

    println("<${answer.joinToString(", ")}>")
}