import java.util.*
import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val t = token.nextToken().toInt()
    val pos = mutableListOf<Triple<Int, Int, Int>>()
    val arr = Array(n) { IntArray(n) }
    val answer = StringBuilder()

    repeat(n) {
        StringTokenizer(readLine()).also {
            pos.add(Triple(it.nextToken().toInt(), it.nextToken().toInt(), it.nextToken().toInt()))
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            var dis = abs(pos[i].second - pos[j].second) + abs(pos[i].third - pos[j].third)

            if (pos[i].first == 1 && pos[j].first == 1) {
                dis = minOf(dis, t)
            }

            arr[i][j] = dis
        }
    }

    for (k in 0 until n) {
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (arr[i][j] > arr[i][k] + arr[k][j]) {
                    arr[i][j] = arr[i][k] + arr[k][j]
                }
            }
        }
    }

    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).also {
            answer.append("${arr[it.nextToken().toInt() - 1][it.nextToken().toInt() - 1]}\n")
        }
    }

    print(answer)
}