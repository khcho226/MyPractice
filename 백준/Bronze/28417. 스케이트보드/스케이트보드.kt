import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    var score = 0

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val que = PriorityQueue<Int>(reverseOrder())
        var total = maxOf(token.nextToken().toInt(), token.nextToken().toInt())

        repeat(5) {
            que.offer(token.nextToken().toInt())
        }

        repeat(2) {
            total += que.poll()
        }

        score = maxOf(score, total)
    }

    print(score)
}