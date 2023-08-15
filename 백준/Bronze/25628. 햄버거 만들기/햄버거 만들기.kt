import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())

    print(minOf(token.nextToken().toInt() / 2, token.nextToken().toInt()))
}