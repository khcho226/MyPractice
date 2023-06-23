import java.util.*

fun main() {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    print(minOf(m, k) + minOf(n - m, n - k))
}