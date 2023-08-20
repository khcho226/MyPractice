import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()
    val len = n.length
    var total = 0L

    n.forEach {
        (it - '0').also { num ->
            repeat(len) {
                total += num * 10.0.pow(it).toLong()
            }
        }
    }

    print(total)
}