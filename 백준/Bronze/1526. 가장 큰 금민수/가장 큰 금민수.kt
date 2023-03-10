import java.io.*

var n = 0
var result = 0

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    n = readLine().toInt()
    dfs(0)
    print(result)
}

fun dfs(sum: Int) {
    if (sum > n) {
        return
    }
    
    dfs(sum * 10 + 7)
    dfs(sum * 10 + 4)
    result = maxOf(result, sum)
}