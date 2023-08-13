import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val c = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val p = token.nextToken().toInt()
    var total = 0

    for (i in 1..c) {
        total += k * i + p * i * i
    }

    print(total)
}