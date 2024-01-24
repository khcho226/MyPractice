import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        val pq = PriorityQueue<Int>()

        StringTokenizer(readLine()).also { st ->
            repeat(5) {
                pq.add(st.nextToken().toInt())
            }
        }

        pq.poll()

        val n1 = pq.poll()
        val n2 = pq.poll()
        val n3 = pq.poll()

        sb.append(
            if (n3 - n1 < 4) {
                "${n1 + n2 + n3}\n"
            } else {
                "KIN\n"
            }
        )
    }

    print(sb)
}