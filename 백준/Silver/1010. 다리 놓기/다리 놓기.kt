import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = Array(31) { LongArray(31) }

    for (i in 1..30) {
        arr[i][1] = i.toLong()
        arr[i][i] = 1

        for (j in 2 until i) {
            arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j]
        }
    }

    var token = StringTokenizer(readLine())
    val t = token.nextToken().toInt()
    val result = StringBuilder()

    repeat(t) {
        token = StringTokenizer(readLine())

        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        result.append("${arr[m][n]}\n")
    }

    println(result)
}