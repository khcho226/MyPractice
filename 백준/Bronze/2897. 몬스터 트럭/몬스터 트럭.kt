import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val r = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    val arr = Array(r) { CharArray(c) }
    val dirR = arrayOf(1, 1, 0, 0)
    val dirC = arrayOf(1, 0, 1, 0)
    val num = Array(r) { IntArray(c) }
    val answer = IntArray(5)

    for (i in 0 until r) {
        readLine().forEachIndexed { j, it ->
            arr[i][j] = it
        }
    }

    for (i in 1 until r) {
        for (j in 1 until c) {
            for (k in 0..3) {
                when (arr[i - dirR[k]][j - dirC[k]]) {
                    'X' -> num[i][j]++
                    '#' -> {
                        num[i][j] = -1
                        break
                    }
                }
            }
        }
    }

    for (i in 1 until r) {
        for (j in 1 until c) {
            num[i][j].also {
                if (it != -1) {
                    answer[it]++
                }
            }
        }
    }

    for (i in 0..4) {
        println(answer[i])
    }
}