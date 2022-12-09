import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = StringTokenizer(readLine())
    val arr = arrayListOf<Int>()

    repeat(3) { arr.add(n.nextToken().toInt()) }
    arr.sort()
    print(arr.joinToString(" "))
}