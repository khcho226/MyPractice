import java.io.*
import java.util.*

data class Record(val time: String, val color: String)

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val pq = PriorityQueue<Record> { o1, o2 -> o1.time.compareTo(o2.time) }
    val score = arrayOf(10, 8, 6, 5, 4, 3, 2, 1)
    var red = 0
    var blue = 0

    repeat(8) {
        StringTokenizer(readLine()).also { st ->
            pq.offer(Record(st.nextToken(), st.nextToken()))
        }
    }

    for (i in 0..7) {
        pq.poll().also {
            if (it.color == "R") {
                red += score[i]
            } else {
                blue += score[i]
            }
        }
    }

    print(
        if (red > blue) {
            "Red"
        } else {
            "Blue"
        }
    )
}