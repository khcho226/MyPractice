import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val u = token.nextToken().toInt()
    val l = token.nextToken().toInt()

    print(
        if (n >= 1000) {
            if (u >= 8000 || l >= 260) {
                "Very Good"
            } else {
                "Good"
            }
        } else {
            "Bad"
        }
    )
}