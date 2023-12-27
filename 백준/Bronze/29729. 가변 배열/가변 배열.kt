import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    var s = token.nextToken().toInt()
    var u = 0

    repeat(token.nextToken().toInt() + token.nextToken().toInt()) {
        if (readLine() == "1") {
            if (s < ++u) {
                s *= 2
            }
        } else {
            u--
        }
    }

    print(s)
}