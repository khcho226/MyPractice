import java.io.*
import java.util.*

data class Date(val n: String, val d: Int, val m: Int, val y: Int) : Comparable<Date> {
    override fun compareTo(other: Date): Int {
        return compareValuesBy(this, other, { it.y }, { it.m }, { it.d })
    }
}

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val pq1 = PriorityQueue<Date>(reverseOrder())
    val pq2 = PriorityQueue<Date>()

    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).also { st ->
            Date(st.nextToken(), st.nextToken().toInt(), st.nextToken().toInt(), st.nextToken().toInt()).also { d ->
                pq1.offer(d)
                pq2.offer(d)
            }
        }
    }

    print("${pq1.poll().n}\n${pq2.poll().n}")
}