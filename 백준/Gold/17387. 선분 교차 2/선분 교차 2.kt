import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val x1 = token.nextToken().toLong()
    val y1 = token.nextToken().toLong()
    val x2 = token.nextToken().toLong()
    val y2 = token.nextToken().toLong()

    token = StringTokenizer(readLine())

    val x3 = token.nextToken().toLong()
    val y3 = token.nextToken().toLong()
    val x4 = token.nextToken().toLong()
    val y4 = token.nextToken().toLong()

    val ccw1 = ccw(x1, y1, x2, y2, x3, y3)
    val ccw2 = ccw(x1, y1, x2, y2, x4, y4)
    val ccw3 = ccw(x3, y3, x4, y4, x1, y1)
    val ccw4 = ccw(x3, y3, x4, y4, x2, y2)

    if (ccw1 * ccw2 == 0 && ccw3 * ccw4 == 0) {
        val x1Temp = minOf(x1, x2)
        val y1Temp = minOf(y1, y2)
        val x2Temp = maxOf(x1, x2)
        val y2Temp = maxOf(y1, y2)
        val x3Temp = minOf(x3, x4)
        val y3Temp = minOf(y3, y4)
        val x4Temp = maxOf(x3, x4)
        val y4Temp = maxOf(y3, y4)

        if (x1Temp <= x4Temp && x3Temp <= x2Temp && y1Temp <= y4Temp && y3Temp <= y2Temp) {
            println(1)
        } else {
            println(0)
        }
    } else if (ccw1 * ccw2 <= 0 && ccw3 * ccw4 <= 0) {
        println(1)
    } else {
        println(0)
    }
}

fun ccw(x1: Long, y1: Long, x2: Long, y2: Long, x3: Long, y3: Long): Int {
    val calc = x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3 * x1

    return if (calc > 0) {
        1
    } else if (calc == 0L) {
        0
    } else {
        -1
    }
}