import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val x = token.nextToken().toInt()
    val y = token.nextToken().toInt()

    print(
        if (x > y) {
            x + y
        } else {
            y - x
        }
    )
}