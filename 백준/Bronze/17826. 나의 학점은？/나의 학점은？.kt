import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val score = readLine()
    var cnt = 1

    while (true) {
        if (st.nextToken() == score) {
            break
        }

        cnt++
    }

    print(
        when (cnt) {
            in 1..5 -> "A+"
            in 6..15 -> "A0"
            in 16..30 -> "B+"
            in 31..35 -> "B0"
            in 36..45 -> "C+"
            in 46..48 -> "C0"
            else -> "F"
        }
    )
}