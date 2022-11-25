import java.io.*
import java.util.*
import kotlin.math.abs

val arr = IntArray(15)
var n = 0
var cnt = 0

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    n = StringTokenizer(readLine()).nextToken().toInt()
    backTracking(0)
    println(cnt)
}

fun backTracking(idx: Int) {
    if (idx == n) {
        cnt++
        return
    }

    for (i in 0 until n) {
        arr[idx] = i

        if (isValid(idx)) {
            backTracking(idx + 1)
        }
    }
}

fun isValid(idx: Int): Boolean {
    for (i in 0 until idx) {
        if (arr[idx] == arr[i] || idx - i == abs(arr[idx] - arr[i])) {
            return false
        }
    }

    return true
}