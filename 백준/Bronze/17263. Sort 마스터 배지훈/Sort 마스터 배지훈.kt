import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    val que = PriorityQueue<Int>(reverseOrder()).also { q ->
        repeat(n) {
            q.add(token.nextToken().toInt())
        }
    }

    print(que.poll())
}