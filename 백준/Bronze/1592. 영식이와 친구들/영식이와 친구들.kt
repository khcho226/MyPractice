import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val l = token.nextToken().toInt()
    val arr = IntArray(n)
    var idx = 0

    while (true) {
        arr[idx]++

        if (arr[idx] == m) {
            break
        } else if (arr[idx] % 2 == 0) {
            idx -= l

            if (idx < 0) {
                idx += n
            }
        } else {
            idx += l

            if (idx >= n) {
                idx -= n
            }
        }
    }

    print(arr.sum() - 1)
}