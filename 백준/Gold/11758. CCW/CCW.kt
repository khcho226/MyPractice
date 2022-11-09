import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val x1 = token.nextToken().toInt()
    val y1 = token.nextToken().toInt()

    token = StringTokenizer(readLine())

    val x2 = token.nextToken().toInt()
    val y2 = token.nextToken().toInt()

    token = StringTokenizer(readLine())

    val x3 = token.nextToken().toInt()
    val y3 = token.nextToken().toInt()

    println(ccw(x1, y1, x2, y2, x3, y3))
}

fun ccw(x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int): Int {
    val calc = x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3 * x1

    return if (calc > 0) {
        1
    } else if (calc == 0) {
        0
    } else {
        -1
    }
}