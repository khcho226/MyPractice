import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.ceil

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = IntArray(9)
    val token = StringTokenizer(readLine()).nextToken().toString()

    token.forEach {
        if (it.code == 57) {
            arr[6] += 1
        } else {
            arr[it.code - 48] += 1
        }
    }

    arr[6] = ceil(arr[6] / 2.0).toInt()
    println(arr.maxOrNull())
}