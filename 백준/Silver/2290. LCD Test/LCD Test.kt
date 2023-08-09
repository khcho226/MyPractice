import java.util.*

lateinit var arr: Array<Array<CharArray>>
var n = 0
var num = ""

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()
    val lines = arrayOf(intArrayOf(0, 1, 2, 4, 5, 6), intArrayOf(2, 5), intArrayOf(0, 2, 3, 4, 6),
        intArrayOf(0, 2, 3, 5, 6), intArrayOf(1, 2, 3, 5), intArrayOf(0, 1, 3, 5, 6), intArrayOf(0, 1, 3, 4, 5, 6),
        intArrayOf(0, 2, 5), intArrayOf(0, 1, 2, 3, 4, 5, 6), intArrayOf(0, 1, 2, 3, 5, 6))

    StringTokenizer(readLine()).also {
        n = it.nextToken().toInt()
        num = it.nextToken()
    }
    arr = Array(num.length) { Array(2 * n + 3) { CharArray(n + 2) { ' ' } } }

    num.forEachIndexed { idx, it ->
        drawLine(idx, lines[it - '0'])
    }

    for (i in 0..(2 * n + 2)) {
        for (j in num.indices) {
            answer.append("${arr[j][i].joinToString("")} ")
        }

        answer.append("\n")
    }

    print(answer)
}

fun drawLine(idx: Int, lines: IntArray) {
    lines.forEach {
        when (it) {
            0 -> {
                for (i in 1..n) {
                    arr[idx][0][i] = '-'
                }
            }
            1 -> {
                for (i in 1..n) {
                    arr[idx][i][0] = '|'
                }
            }
            2 -> {
                for (i in 1..n) {
                    arr[idx][i][n + 1] = '|'
                }
            }
            3 -> {
                for (i in 1..n) {
                    arr[idx][n + 1][i] = '-'
                }
            }
            4 -> {
                for (i in (n + 2)..(2 * n + 1)) {
                    arr[idx][i][0] = '|'
                }
            }
            5 -> {
                for (i in (n + 2)..(2 * n + 1)) {
                    arr[idx][i][n + 1] = '|'
                }
            }
            else -> {
                for (i in 1..n) {
                    arr[idx][2 * n + 2][i] = '-'
                }
            }
        }
    }
}