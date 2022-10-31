import java.io.*
import java.util.*

private lateinit var array: Array<IntArray>

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    array = Array(n + 1){ IntArray(n + 1) }
    setArray(n)
    println(array[n][k])
}

fun setArray(n: Int) {
    for (i in 0..n) {
        array[i][0] = 1

        for (j in 1..i) {
            array[i][j] = (array[i - 1][j - 1] + array[i - 1][j]) % 10007
        }
    }
}