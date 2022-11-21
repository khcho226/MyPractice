import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = IntArray(10)
    val token = StringTokenizer(readLine()).nextToken().toString()

    token.forEach { arr[it - '0']++ }
    arr[6] = (arr[6] + arr[9] + 1) / 2
    arr[9] = 0
    println(arr.maxOrNull())
}