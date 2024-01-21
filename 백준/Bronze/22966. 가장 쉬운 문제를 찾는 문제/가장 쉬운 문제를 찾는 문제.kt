import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val pq = PriorityQueue<Pair<String, String>> { o1, o2 -> o1.second.compareTo(o2.second) }

    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).also { st ->
            pq.offer(Pair(st.nextToken(), st.nextToken()))
        }
    }

    print(pq.poll().first)
}