import java.io.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val m = readLine().toInt()
    val n = readLine().toInt()
    var sum = 0
    var min = 10000

    for (i in m..n) {
        if (i == sqrt(i.toDouble()).toInt() * sqrt(i.toDouble()).toInt()) {
            sum += i
            min = minOf(min, i)
        }
    }

    if (sum == 0) {
        print(-1)
    } else {
        print("${sum}\n$min")
    }
}