import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val arr = Array(n) { CharArray(n) }
    var answer = "YES"

    for (i in 0 until n) {
        readLine().forEachIndexed { j, c ->
            arr[i][j] = c
        }
    }

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (arr[i][j] != arr[j][i]) {
                answer = "NO"
                break
            }
        }
    }

    print(answer)
}