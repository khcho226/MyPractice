import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val pq1 = PriorityQueue<Int>(reverseOrder())
    val pq2 = PriorityQueue<Int>(reverseOrder())
    var s1 = 0
    var s2 = 0

    repeat(10) { pq1.offer(readLine().toInt()) }
    repeat(10) { pq2.offer(readLine().toInt()) }
    repeat(3) {
        s1 += pq1.poll()
        s2 += pq2.poll()
    }

    print("$s1 $s2")
}