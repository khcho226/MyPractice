import java.util.*

data class Point(val x: Int, val y: Int, val d: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val (x, y) = readLine().split(" ").map { it.toInt() }
    val que = ArrayDeque<Point>()
    val visited = Array(n + 1) { BooleanArray(n + 1) }
    val arr = Array(n + 1) { IntArray(n + 1) }
    val dx = intArrayOf(1, 2, 2, 1, -1, -2, -2, -1)
    val dy = intArrayOf(2, 1, -1, -2, -2, -1, 1, 2)

    que.add(Point(x, y, 0))
    visited[x][y] = true

    while (que.isNotEmpty()) {
        val now = que.poll().also {
            arr[it.x][it.y] = it.d
        }

        for (i in 0..7) {
            val nx = now.x + dx[i]
            val ny = now.y + dy[i]

            if (nx < 1 || nx > n || ny < 1 || ny > n || visited[nx][ny]) {
                continue
            }

            que.add(Point(nx, ny, now.d + 1))
            visited[nx][ny] = true
        }
    }

    repeat(m) {
        StringTokenizer(readLine()).also {
            print("${arr[it.nextToken().toInt()][it.nextToken().toInt()]} ")
        }
    }
}