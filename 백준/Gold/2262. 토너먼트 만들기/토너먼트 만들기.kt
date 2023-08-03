import java.util.*
import kotlin.math.*

fun main(): Unit = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    val lst = mutableListOf<Int>().also { lst ->
        repeat(n) {
            lst.add(token.nextToken().toInt())
        }
    }
    var total = 0

    for (i in n downTo 2) {
        lst.indexOf(i).also { idx ->
            total += when (idx) {
                0 -> abs(lst[1] - i)
                lst.lastIndex -> abs(lst[idx - 1] - i)
                else -> abs(max(lst[idx - 1], lst[idx + 1]) - i)
            }

            lst.removeAt(idx)
        }
    }

    print(total)
}
