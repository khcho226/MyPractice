import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    val que = PriorityQueue<Int>().also { q ->
        repeat(n) {
            q.add(token.nextToken().toInt())
        }
    }
    var num = 0

    while (que.isNotEmpty()) {
        val now = que.poll()

        if (num < now - 1) {
            break
        } else {
            num += now
        }
    }

    print(num + 1)
}