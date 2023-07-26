import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val lst = mutableListOf<Pair<Int, Int>>()
    val n = readLine().toInt()
    var token: StringTokenizer
    var max = 1
    var cnt = 1

    repeat(readLine().toInt()) {
        token = StringTokenizer(readLine())
        lst.add(Pair(token.nextToken().toInt(), token.nextToken().toInt()))
    }

    lst.sortedWith(compareBy({ it.first }, { it.second })).forEach {
        if (it.first <= max) {
            max = max.coerceAtLeast(it.second)
        } else {
            cnt += it.first - max
            max = it.second
        }
    }

    print(cnt + n - max)
}