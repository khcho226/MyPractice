import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val arr = arrayListOf<Int>()
    var sum = 0

    for (i in 1..45) {
        repeat(i) { arr.add(i) }
    }

    for (i in a..b) {
        sum += arr[i - 1]
    }

    print(sum)
}