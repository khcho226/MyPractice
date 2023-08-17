import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val h = token.nextToken().toInt()
    val i = token.nextToken().toInt()
    val a = token.nextToken().toInt()
    val r = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    print(h * i - a * r * c)
}