import java.util.*

fun main() {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val w = token.nextToken().toInt()
    val h = token.nextToken().toInt()
    val l = token.nextToken().toInt()

    print(minOf(n, (w / l) * (h / l)))
}