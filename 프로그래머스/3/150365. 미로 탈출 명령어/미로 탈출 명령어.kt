import kotlin.math.*

class Solution {
    val dx = arrayOf(1, 0, 0, -1)
    val dy = arrayOf(0, -1, 1, 0)
    val ds = arrayOf("d", "l", "r", "u")
    var answer = ""

    fun solution(n: Int, m: Int, x: Int, y: Int, r: Int, c: Int, k: Int): String {
        (abs(x - r) + abs(y - c)).also {
            if (it > k || (k - it) % 2 == 1) {
                return "impossible"
            }
        }

        dfs(n, m, x, y, r, c, k, 0, "")
        return answer
    }

    fun dfs(n: Int, m: Int, x: Int, y: Int, r: Int, c: Int, k: Int, cnt: Int, s: String) {
        if (answer != "" || abs(x - r) + abs(y - c) > k - cnt) {
            return
        }

        if (x == r && y == c && k == cnt) {
            answer = s
            return
        }

        repeat(4) {
            val nx = x + dx[it]
            val ny = y + dy[it]

            if (nx in 1..n && ny in 1..m) {
                dfs(n, m, nx, ny, r, c, k, cnt + 1, s + ds[it])
            }
        }
    }
}