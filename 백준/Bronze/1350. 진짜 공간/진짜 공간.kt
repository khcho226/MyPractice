import java.util.*
import kotlin.math.*

fun main() {
    val n = readLine()!!.toInt()
    val token = StringTokenizer(readLine())
    val size = readLine()!!.toInt()
    var cnt = 0L

    repeat(n) {
        cnt += ceil(token.nextToken().toDouble() / size).toLong()
    }

    print(size * cnt)
}