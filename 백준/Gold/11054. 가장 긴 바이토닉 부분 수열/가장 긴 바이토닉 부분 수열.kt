import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = StringTokenizer(readLine()).nextToken().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }}
    val rightArr = IntArray(n) { 1 }
    val leftArr = IntArray(n) { 1 }

    for (i in 1 until n) {
        for (j in 0 until i) {
            if (arr[i] > arr[j]) {
                rightArr[i] = maxOf(rightArr[i], rightArr[j] + 1)
            }
        }
    }

    for (i in (n - 2) downTo 0) {
        for (j in (n - 1) downTo (i + 1)) {
            if (arr[i] > arr[j]) {
                leftArr[i] = maxOf(leftArr[i], leftArr[j] + 1)
            }
        }
    }

    println(rightArr.mapIndexed { index, i -> i + leftArr[index] }.maxOf { it } - 1)
}