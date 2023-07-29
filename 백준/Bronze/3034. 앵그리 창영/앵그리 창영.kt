import java.util.*
import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val len = sqrt(token.nextToken().toDouble().pow(2) + token.nextToken().toDouble().pow(2))
    val answer = StringBuilder()

    repeat(n) {
        answer.append(
            if (readLine().toDouble() <= len) {
                "DA\n"
            } else {
                "NE\n"
            }
        )
    }

    print(answer)
}