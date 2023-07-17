class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        val dp = IntArray(y + 1) { Int.MAX_VALUE }.also { it[x] = 0 }

        for (i in x..y) {
            if (dp[i] == Int.MAX_VALUE) {
                continue
            }

            intArrayOf(i + n, i * 2, i * 3).forEach {
                if (it <= y) {
                    dp[it] = minOf(dp[it], dp[i] + 1)
                }
            }
        }

        return if (dp[y] != Int.MAX_VALUE) {
            dp[y]
        } else {
            -1
        }
    }
}