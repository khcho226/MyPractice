import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val arr = IntArray(n + 1)
    val answer = StringBuilder()

    token = StringTokenizer(readLine())
    repeat(n) { arr[it + 1] = arr[it] + token.nextToken().toInt() }
    repeat(m) {
        token = StringTokenizer(readLine())

        val j = token.nextToken().toInt()
        val k = token.nextToken().toInt()
        val sum = arr[k] - arr[j - 1]

        answer.append("${sum}\n")
    }
    println(answer)
}