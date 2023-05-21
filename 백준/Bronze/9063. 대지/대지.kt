import kotlin.math.*

fun main() {
    var maxX = -10000
    var minX = 10000
    var maxY = -10000
    var minY = 10000

    repeat(readLine()!!.toInt()) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }

        maxX = maxOf(maxX, x)
        minX = minOf(minX, x)
        maxY = maxOf(maxY, y)
        minY = minOf(minY, y)
    }

    print(abs(maxX - minX) * abs(maxY - minY))
}