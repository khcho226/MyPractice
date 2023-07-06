import java.util.*

class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val maxRow = park.size
        val maxCol = park[0].length
        var row = 0
        var col = 0

        park.forEachIndexed { idx, it ->
            it.forEachIndexed { idx2, it2 ->
                if (it2 == 'S') {
                    row = idx
                    col = idx2
                }
            }
        }

        routes.forEach {
            val token = StringTokenizer(it)
            val dir = token.nextToken()
            val len = token.nextToken().toInt()

            when (dir) {
                "N" -> if (row - len >= 0 && park.map { it[col] }.subList(row - len, row).contains('X').not()) {
                    row -= len
                }
                "S" -> if (row + len < maxRow && park.map { it[col] }.subList(row + 1, row + len + 1).contains('X').not()) {
                    row += len
                }
                "E" -> if (col + len < maxCol && park[row].substring(col + 1, col + len + 1).contains("X").not()) {
                    col += len
                }
                else -> if (col - len >= 0 && park[row].substring(col - len, col).contains("X").not()) {
                    col -= len
                }
            }
        }

        return intArrayOf(row, col)
    }
}