import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken()
    val b = token.nextToken()
    val c = token.nextToken()

    print(
        if (a == b && b == c) {
            "*"
        } else if (b == c) {
            "A"
        } else if (a == c) {
            "B"
        } else {
            "C"
        }
    )
}