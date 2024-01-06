import java.io.*

class Solution {
    fun solution(game_board: Array<IntArray>, table: Array<IntArray>): Int {
        val len = game_board.size
        val arr = ArrayList<ArrayList<IntArray>>()
        var nTable = Array(len) { table[it].copyOf() }
        var answer = 0

        for (i in 0 until len) {
            for (j in 0 until len) {
                if (game_board[i][j] == 0) {
                    arr.add(dfs(game_board, i, j, 0, 0, len, 0))
                }
            }
        }

        repeat(4) {
            var copiedTable = Array(len) { nTable[it].copyOf() }

            for (i in 0 until len) {
                for (j in 0 until len) {
                    if (copiedTable[i][j] == 1) {
                        val nArr = dfs(copiedTable, i, j, 0, 0, len, 1)
                        var flag1 = true

                        for (k in 0 until arr.size) {
                            val temp = arr[k]
                            var flag2 = true

                            if (nArr.size != temp.size) {
                                continue
                            }

                            for (l in 0 until nArr.size) {
                                if (nArr[l][0] != temp[l][0] || nArr[l][1] != temp[l][1]) {
                                    flag2 = false
                                    break
                                }
                            }

                            if (flag2) {
                                arr.removeAt(k)
                                nTable = Array(len) { copiedTable[it].copyOf() }
                                answer += nArr.size
                                flag1 = false
                                break
                            }
                        }

                        if (flag1) {
                            copiedTable = Array(len) { nTable[it].copyOf() }
                        }
                    }
                }
            }

            if (it < 3) {
                val tTable = Array(len) { IntArray(len) }

                for (i in 0 until len) {
                    for (j in 0 until len) {
                        tTable[i][j] = nTable[len - j - 1][i]
                    }
                }

                nTable = Array(len) { tTable[it].copyOf() }
            }
        }

        return answer
    }
}

fun dfs(board: Array<IntArray>, x: Int, y: Int, px: Int, py: Int, len: Int, num: Int): ArrayList<IntArray> {
    val arr = ArrayList<IntArray>()
    val dirs = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))

    board[x][y] = 2
    arr.add(intArrayOf(px, py))

    dirs.forEach {
        val nx = x + it[0]
        val ny = y + it[1]

        if (nx in 0 until len && ny in 0 until len && board[nx][ny] == num) {
            arr.addAll(dfs(board, nx, ny, px + it[0], py + it[1], len, num))
        }
    }

    return arr
}