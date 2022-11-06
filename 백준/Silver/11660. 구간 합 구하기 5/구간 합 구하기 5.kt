import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val arr = Array(n) { IntArray(n + 1) }

    repeat(n) { row ->
        token = StringTokenizer(readLine())
        repeat(n) { arr[row][it + 1] = arr[row][it] + token.nextToken().toInt() }
    }

    val answer = StringBuilder()

    repeat(m) {
        token = StringTokenizer(readLine())

        val x1 = token.nextToken().toInt() - 1
        val y1 = token.nextToken().toInt() - 1
        val x2 = token.nextToken().toInt()
        val y2 = token.nextToken().toInt()
        var temp = 0

        repeat(x2 - x1) { temp += arr[x1 + it][y2] - arr[x1 + it][y1] }
        answer.append("${temp}\n")
    }
    println(answer)
}
