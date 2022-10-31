import java.io.*
import java.util.*

private var n = 0
private var m = 0

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())

    n = token.nextToken().toInt()
    m = token.nextToken().toInt()
    dfs(BooleanArray(n), IntArray(m), 0)
}

fun dfs(isVisited: BooleanArray, arr: IntArray, depth: Int) {
    if (depth == m) {
        val result = StringBuilder()

        arr.forEach { result.append(it).append(" ") }
        println(result)
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