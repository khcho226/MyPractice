import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = IntArray(100)
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var sum = 0

    repeat(n) {
        val idx = token.nextToken().toInt() - 1

        if (arr[idx] == 0) {
            arr[idx]++
        } else {
            sum++
        }
    }
    print(sum)
}