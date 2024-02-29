import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = Array(n + 1) { IntArray(m + 1) }
    val sb = StringBuilder()

    for (i in 1..n) {
        StringTokenizer(readLine()).also {
            for (j in 1..m) {
                arr[i][j] += arr[i][j - 1] + it.nextToken().toInt()
            }
        }
    }

    for (i in 1..n) {
        for (j in 1..m) {
            arr[i][j] += arr[i - 1][j]
        }
    }

    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).also { st ->
            val i = st.nextToken().toInt()
            val j = st.nextToken().toInt()
            val x = st.nextToken().toInt()
            val y = st.nextToken().toInt()

            sb.append("${arr[i - 1][j - 1] + arr[x][y] - arr[i - 1][y] - arr[x][j - 1]}\n")
        }
    }

    print(sb)
}