class Solution {
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    fun solution(board: Array<IntArray>, aloc: IntArray, bloc: IntArray): Int {
        return dfs(board, aloc[0], aloc[1], bloc[0], bloc[1]).second
    }

    fun dfs(board: Array<IntArray>, x1: Int, y1: Int, x2: Int, y2: Int): Pair<Boolean, Int> {
        if (isFinished(board, x1, y1)) {
            return Pair(false, 0)
        }

        if (x1 == x2 && y1 == y2) {
            return Pair(true, 1)
        }

        var canWin = false
        var minTurn = Int.MAX_VALUE
        var maxTurn = 0
        var turn: Int

        for (i in 0..3) {
            val nx = x1 + dx[i]
            val ny = y1 + dy[i]
            var result: Pair<Boolean, Int>

            if (isInRange(board, nx, ny).not() || board[nx][ny] == 0) {
                continue
            }

            board[x1][y1] = 0
            result = dfs(board, x2, y2, nx, ny)
            board[x1][y1] = 1

            if (result.first.not()) {
                canWin = true
                minTurn = minOf(minTurn, result.second)
            } else {
                maxTurn = maxOf(maxTurn, result.second)
            }
        }

        turn = if (canWin) {
            minTurn
        } else {
            maxTurn
        }

        return Pair(canWin, turn + 1)
    }

    fun isFinished(board: Array<IntArray>, x: Int, y: Int): Boolean {
        repeat(4) {
            val nx = x + dx[it]
            val ny = y + dy[it]

            if (isInRange(board, nx, ny) && board[nx][ny] == 1) {
                return false
            }
        }

        return true
    }

    fun isInRange(board: Array<IntArray>, x: Int, y: Int): Boolean {
        return 0 <= x && x < board.size && 0 <= y && y < board[0].size
    }
}