import java.util.*

fun main() {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    print((a + 1) * (b + 1) / (c + 1) - 1)
}