import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    var total = 0

    while (token.hasMoreTokens()) {
        total += token.nextToken().toInt()
    }

    print(total)
}