import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val arr = Array(n + 1) { IntArray(n + 1) }

    repeat(n) { row ->
        token = StringTokenizer(readLine())
        repeat(n) { col ->
            arr[row + 1][col + 1] = arr[row + 1][col] + arr[row][col + 1] - arr[row][col] + token.nextToken().toInt()
        }
    }

    val answer = StringBuilder()

    repeat(m) {
        token = StringTokenizer(readLine())

        val x1 = token.nextToken().toInt()
        val y1 = token.nextToken().toInt()
        val x2 = token.nextToken().toInt()
        val y2 = token.nextToken().toInt()

        answer.append("${arr[x2][y2] + arr[x1 - 1][y1 - 1] - arr[x2][y1 - 1] - arr[x1 - 1][y2]}\n")
    }
    println(answer)
}