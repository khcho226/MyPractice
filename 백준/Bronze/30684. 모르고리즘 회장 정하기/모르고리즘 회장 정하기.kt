import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val pq = PriorityQueue<String>()

    repeat(readLine().toInt()) {
        readLine().also { name ->
            if (name.length == 3) {
                pq.offer(name)
            }
        }
    }

    print(pq.poll())
}