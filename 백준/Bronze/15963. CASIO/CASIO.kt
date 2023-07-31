import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())

    print(
        if (token.nextToken() == token.nextToken()) {
            1
        } else {
            0
        }
    )
}