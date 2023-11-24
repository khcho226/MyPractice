class Solution {
    fun solution(board: Array<IntArray>, skill: Array<IntArray>): Int {
        val arr = Array(board.size + 1) { IntArray(board[0].size + 1) }
        var answer = 0

        skill.forEach {
            val degree = if (it[0] == 2) {
                it[5]
            } else {
                -it[5]
            }

            arr[it[1]][it[2]] += degree
            arr[it[1]][it[4] + 1] -= degree
            arr[it[3] + 1][it[2]] -= degree
            arr[it[3] + 1][it[4] + 1] += degree
        }

        arr.forEach {
            for (i in 1 until it.size) {
                it[i] += it[i - 1]
            }
        }

        for (j in 1 until arr.size) {
            arr[j] = arr[j].zip(arr[j - 1]).map { it.first + it.second }.toIntArray()
        }

        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] + arr[i][j] > 0) {
                    answer++
                }
            }
        }

        return answer
    }
}