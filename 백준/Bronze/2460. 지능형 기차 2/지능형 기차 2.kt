import java.util.*

fun main() {
    val que = PriorityQueue<Int>(reverseOrder())
    var total = 0

    repeat(10) {
        val token = StringTokenizer(readLine())
        val on = token.nextToken().toInt()
        val off = token.nextToken().toInt()

        total -= on - off
        que.add(total)
    }

    print(que.poll())
}