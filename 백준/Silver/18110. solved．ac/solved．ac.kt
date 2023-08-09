import java.lang.Math.*
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sub = round(n * 0.15).toInt()
    val que = PriorityQueue<Int>().also { q ->
        repeat(n) {
            q.add(readLine().toInt())
        }
    }
    var total = 0

    repeat(sub) {
        que.poll()
    }

    repeat(n - 2 * sub) {
        total += que.poll()
    }

    println(round(total.toDouble() / (n - 2 * sub)).toInt())
}