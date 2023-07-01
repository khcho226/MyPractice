import java.util.*

fun main() {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    println(
        when {
            a < maxOf(n, b) -> "Bus"
            a > maxOf(n, b) -> "Subway"
            else -> "Anything"
        }
    )
}