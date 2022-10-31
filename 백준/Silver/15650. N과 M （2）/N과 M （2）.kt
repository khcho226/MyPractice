import java.io.*
import java.util.*

var n = 0
var m = 0
val result = StringBuilder()

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())

    n = token.nextToken().toInt()
    m = token.nextToken().toInt()
    dfs(IntArray(m + 1), 0)
    println(result)
}

fun dfs(arr: IntArray, depth: Int) {
    if (depth == m) {
        for (i in 1..m) {
            result.append(arr[i]).append(" ")
        }

        result.append("\n")
        return
    }

    for (i in 0 until n) {
        if (i + 1 > arr[depth]) {
            arr[depth + 1] = i + 1
            dfs(arr, depth + 1)
        }
    }
}