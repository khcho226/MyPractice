import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    val que = PriorityQueue<Int>()
    var total = 0

    repeat(n) {
        que.add(token.nextToken().toInt())
    }

    repeat(n - 1) {
        total += que.poll()
    }

    print(total)
}