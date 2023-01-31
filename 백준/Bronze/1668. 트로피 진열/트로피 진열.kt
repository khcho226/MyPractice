import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val arr = IntArray(n)
    var right = 0
    var tempRight = 0
    var left = 0
    var tempLeft = 0

    repeat(n) {
        val num = readLine().toInt()

        if (num > tempRight) {
            right++
            tempRight = num
        }

        arr[n - it - 1] = num
    }

    for (i in arr) {
        if (i > tempLeft) {
            left++
            tempLeft = i
        }

        if (tempRight == tempLeft) {
            break
        }
    }

    print("${right}\n$left")
}