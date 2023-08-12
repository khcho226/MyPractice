import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    var cnt = 0

    while (token.hasMoreTokens()) {
        if (token.nextToken().toInt() > 0) {
            cnt++
        }
    }

    print(cnt)
}