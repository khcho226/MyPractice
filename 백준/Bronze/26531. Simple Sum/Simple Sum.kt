import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    var a: Int
    var b: Int
    var c: Int

    a = token.nextToken().toInt()
    token.nextToken()
    b = token.nextToken().toInt()
    token.nextToken()
    c = token.nextToken().toInt()

    print(
        if (a + b == c) {
            "YES"
        } else {
            "NO"
        }
    )
}