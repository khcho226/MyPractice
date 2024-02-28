import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val q: Queue<Int> = LinkedList()
    val sb = StringBuilder()

    for (i in 1..readLine().toInt()) {
        q.offer(i)
    }

    while (q.isNotEmpty()) {
        sb.append("${q.poll()} ")

        if (q.isNotEmpty()) {
            q.offer(q.poll())
        }
    }

    print(sb)
}