import java.io.*
import java.util.*
import kotlin.math.*

var x1 = 0.0
var y1 = 0.0

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val lst = mutableListOf<Pair<Double, Double>>()

    repeat(n) {
        token = StringTokenizer(readLine())
        lst.add(Pair(token.nextToken().toDouble(), token.nextToken().toDouble()))
    }

    var sum = 0.0

    x1 = lst[0].first
    y1 = lst[0].second
    repeat(n - 2) { sum += ccw(lst[it + 1].first, lst[it + 1].second, lst[it + 2].first, lst[it + 2].second) }
    println(String.format("%.1f", abs(sum) / 2))
}

fun ccw(x2: Double, y2: Double, x3: Double, y3: Double): Double = x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3 * x1