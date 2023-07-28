import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    val arr = IntArray(n) { token.nextToken().toInt() }
    var min = Int.MAX_VALUE

    if (n <= 2) {
        print(0)
        return
    }

    for (c1 in -1..1) {
        for (c2 in -1..1) {
            val dif = arr[1] + c2 - arr[0] - c1
            var now = arr[1] + c2
            var cnt = 0
            var isSeq = true

            if (c1 != 0) {
                cnt++
            }

            if (c2 != 0) {
                cnt++
            }

            for (i in 2 until n) {
                now += dif

                when (now) {
                    arr[i] -> continue
                    arr[i] - 1, arr[i] + 1 -> cnt++
                    else -> {
                        isSeq = false
                        break
                    }
                }
            }

            if (isSeq) {
                min = minOf(min, cnt)
            }
        }
    }

    print(
        if (min != Int.MAX_VALUE) {
            min
        } else {
            -1
        }
    )
}