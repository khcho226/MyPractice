import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val pq1 = PriorityQueue<Int>(reverseOrder())
        val pq2 = PriorityQueue<Int>()

        StringTokenizer(readLine()).also { st ->
            repeat(n) {
                st.nextToken().toInt().also { num ->
                    pq1.offer(num)
                    pq2.offer(num)
                }
            }
        }
        
        sb.append("${(pq1.poll() - pq2.poll()) * 2}\n")
    }

    print(sb)
}