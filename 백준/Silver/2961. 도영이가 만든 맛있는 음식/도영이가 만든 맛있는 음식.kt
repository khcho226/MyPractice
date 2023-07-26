import java.util.*
import kotlin.math.*

private lateinit var nums: IntArray
val lst = mutableListOf<Pair<Long, Long>>()
val picked = mutableListOf<Int>()
var n = 0
var min = Long.MAX_VALUE

fun main() = with(System.`in`.bufferedReader()) {
    var token: StringTokenizer

    n = readLine().toInt()
    nums = IntArray(n) { it }

    repeat(n) {
        token = StringTokenizer(readLine())
        lst.add(Pair(token.nextToken().toLong(), token.nextToken().toLong()))
    }

    for (i in 1..n) {
        combination(0, i, 0)
    }

    print(min)
}

fun combination(cnt: Int, depth: Int, begin: Int) {
    if (cnt == depth) {
        getMin()
        return
    }

    for (i in begin until n) {
        picked.add(nums[i])
        combination(cnt + 1, depth, i + 1)
        picked.removeLast()
    }
}

fun getMin() {
    var totalA = 1L
    var totalB = 0L

    picked.forEach {
        totalA *= lst[it].first
        totalB += lst[it].second
    }

    min = min.coerceAtMost(abs(totalA - totalB))
}