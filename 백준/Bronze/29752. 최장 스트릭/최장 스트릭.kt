import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var streak = 0
    var cnt = 0

    repeat(n) {
        if (token.nextToken().toInt() == 0) {
            streak = maxOf(streak, cnt)
            cnt = 0
        } else {
            cnt++
        }
    }

    print(maxOf(streak, cnt))
}