import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val arr = IntArray(101)
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    var total = 0

    repeat(3) {
        StringTokenizer(readLine()).also {
            for (i in it.nextToken().toInt() until it.nextToken().toInt()) {
                arr[i]++
            }
        }
    }

    arr.forEach {
        total += when (it) {
            1 -> a
            2 -> b * 2
            3 -> c * 3
            else -> 0
        }
    }

    print(total)
}