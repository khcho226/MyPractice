import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine()).nextToken().toString()
    val arr = IntArray(26)

    token.forEach { arr[it.code - 97] += 1 }
    print(arr.joinToString(" "))
}