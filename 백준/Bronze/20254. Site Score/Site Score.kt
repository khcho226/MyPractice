import java.util.*

fun main() {
    val token = StringTokenizer(readLine())
    val ur = token.nextToken().toInt()
    val tr = token.nextToken().toInt()
    val uo = token.nextToken().toInt()
    val to = token.nextToken().toInt()

    print(56 * ur + 24 * tr + 14 * uo + 6 * to)
}
