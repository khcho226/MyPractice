import java.util.*

fun main() {
    val token = StringTokenizer(readLine())
    val a = token.nextToken()
    val b = token.nextToken()
    val c = token.nextToken()
    val d = token.nextToken()

    println((a + b).toLong() + (c + d).toLong())
}