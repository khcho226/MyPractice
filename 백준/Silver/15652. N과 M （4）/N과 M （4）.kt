import java.io.*
import java.util.*

var n = 0
var m = 0
val result = StringBuilder()

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())

    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    val arr = IntArray(m + 1) { 1 }

    dfs(arr, 0)
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

    for (i in arr[depth]..n) {
        arr[depth + 1] = i
        dfs(arr, depth + 1)
    }
}