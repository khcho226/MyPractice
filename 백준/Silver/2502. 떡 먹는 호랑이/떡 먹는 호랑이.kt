import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val d = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val arr = IntArray(d).also {
        it[0] = 1
        it[1] = 1
    }

    while (true) {
        for (i in 2 until d) {
            arr[i] = arr[i - 1] + arr[i - 2]
        }

        when {
            arr.last() < k -> arr[1]++
            arr.last() > k -> {
                arr[0]++
                arr[1] = arr[0]
            }
            else -> break
        }
    }

    print("${arr[0]}\n${arr[1]}")
}