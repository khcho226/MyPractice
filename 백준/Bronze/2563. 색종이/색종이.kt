import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val array = Array(100) { IntArray(100) }

    repeat(n) {
        token = StringTokenizer(readLine())

        val x = token.nextToken().toInt()
        val y = token.nextToken().toInt()

        for (i in 0..9) {
            for (j in 0..9) {
                array[x + i - 1][y + j - 1] = 1
            }
        }
    }

    println(array.sumOf { it.sum() })
}