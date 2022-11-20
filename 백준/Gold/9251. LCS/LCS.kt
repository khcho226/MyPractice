import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val a = StringTokenizer(readLine()).nextToken().toString()
    val b = StringTokenizer(readLine()).nextToken().toString()
    val arr = Array(a.length + 1) { IntArray(b.length + 1) }

    for (i in 1..a.length) {
        for (j in 1..b.length) {
            arr[i][j] = if (a[i - 1] == b[j - 1]) {
                arr[i - 1][j - 1] + 1
            } else {
                maxOf(arr[i - 1][j], arr[i][j - 1])
            }
        }
    }

    println(arr[a.length][b.length])
}