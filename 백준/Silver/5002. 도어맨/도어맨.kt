import kotlin.math.*

fun main(): Unit = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val line = readLine().map {
        if (it == 'M') {
            1
        } else {
            -1
        }
    }
    var cnt = 0

    line.indexOfFirst {
        cnt += it
        abs(cnt) > n + 1
    }.also {
        print(
            if (it == -1) {
                if (abs(cnt) != n + 1) {
                    line.size
                } else {
                    line.size - 1
                }
            } else {
                it - 1
            }
        )
    }
}