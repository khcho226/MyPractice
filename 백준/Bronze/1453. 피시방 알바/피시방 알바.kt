import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = BooleanArray(100)
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var sum = 0

    repeat(n) {
        val idx = token.nextToken().toInt() - 1

        if (arr[idx].not()) {
            arr[idx] = true
        } else {
            sum++
        }
    }
    print(sum)
}