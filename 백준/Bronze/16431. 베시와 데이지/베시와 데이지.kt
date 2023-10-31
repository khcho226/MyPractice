import java.util.*
import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val arr = arrayOf(IntArray(2), IntArray(2), IntArray(2)).also { a ->
        repeat(3) { i ->
            StringTokenizer(readLine()).also { t ->
                a[i][0] = t.nextToken().toInt()
                a[i][1] = t.nextToken().toInt()
            }
        }
    }
    val b = max(abs(arr[0][0] - arr[2][0]), abs(arr[0][1] - arr[2][1]))
    val d = abs(arr[1][0] - arr[2][0]) + abs(arr[1][1] - arr[2][1])

    print(
        when {
            b < d -> "bessie"
            b > d -> "daisy"
            else -> "tie"
        }
    )
}