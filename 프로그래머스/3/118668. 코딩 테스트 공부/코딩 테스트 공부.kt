class Solution {
    fun solution(alp: Int, cop: Int, problems: Array<IntArray>): Int {
        var maxAlp = 0
        var maxCop = 0

        problems.forEach {
            maxAlp = maxOf(maxAlp, it[0])
            maxCop = maxOf(maxCop, it[1])
        }

        val sAlp = minOf(alp, maxAlp)
        val sCop = minOf(cop, maxCop)
        val dp = Array(maxAlp + 1) { IntArray(maxCop + 1) { Int.MAX_VALUE } }

        dp[sAlp][sCop] = 0

        for (i in sAlp..maxAlp) {
            for (j in sCop..maxCop) {
                if (i < maxAlp) {
                    dp[i + 1][j] = minOf(dp[i + 1][j], dp[i][j] + 1)
                }

                if (j < maxCop) {
                    dp[i][j + 1] = minOf(dp[i][j + 1], dp[i][j] + 1)
                }

                problems.forEach {
                    if (i >= it[0] && j >= it[1]) {
                        val nAlp = minOf(i + it[2], maxAlp)
                        val nCop = minOf(j + it[3], maxCop)

                        dp[nAlp][nCop] = minOf(dp[nAlp][nCop], dp[i][j] + it[4])
                    }
                }
            }
        }

        return dp[maxAlp][maxCop]
    }
}