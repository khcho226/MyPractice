import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val arr = Array(n + 2) { IntArray(m + 2) }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    var cnt = 2 * n * m

    for (i in 1..n) {
        StringTokenizer(readLine()).also {
            for (j in 1..m) {
                arr[i][j] = it.nextToken().toInt()
            }
        }
    }

    for (row in 1..n) {
        for (col in 1..m) {
            for (i in 0..3) {
                val nx = row + dx[i]
                val ny = col + dy[i]
                val diff = arr[row][col] - arr[nx][ny]
                
                if (diff > 0) {
                    cnt += diff
                }
            }
        }
    }

    print(cnt)
}