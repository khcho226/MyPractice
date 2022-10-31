import java.io.*
import java.util.*

var n = 0
var m = 0
val result = StringBuilder()

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())

    n = token.nextToken().toInt()
    m = token.nextToken().toInt()
    dfs(BooleanArray(n), IntArray(m), 0)
    println(result)
}

fun dfs(isVisited: BooleanArray, arr: IntArray, depth: Int) {
    if (depth == m) {
        arr.forEach { result.append(it).append(" ") }
        result.append("\n")
        return
    }

    for (i in 0 until n) {
        if (isVisited[i].not()) {
            isVisited[i] = true
            arr[depth] = i + 1
            dfs(isVisited, arr, depth + 1)
            isVisited[i] = false
        }
    }
}