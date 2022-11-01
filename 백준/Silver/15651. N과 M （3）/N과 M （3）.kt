import java.io.*
import java.util.*

var n = 0
var m = 0
val result = StringBuilder()

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())

    n = token.nextToken().toInt()
    m = token.nextToken().toInt()
    dfs(IntArray(m), 0)
    println(result)
}

fun dfs(arr: IntArray, depth: Int) {
    if (depth == m) {
        arr.forEach { result.append("$it ") }
        result.append("\n")
        return
    }

    for (i in 1..n) {
        arr[depth] = i
        dfs(arr, depth + 1)
    }
}