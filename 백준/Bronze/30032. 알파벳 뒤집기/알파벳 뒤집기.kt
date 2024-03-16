import java.io.*
import java.util.*

val sb = StringBuilder()

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val d = st.nextToken().toInt()

    repeat(n) {
        readLine().forEach { c ->
            flip(d, c)
        }

        sb.append("\n")
    }

    print(sb)
}

fun flip(d: Int, c: Char) {
    sb.append(
        if (d == 1) {
            when (c) {
                'b' -> 'p'
                'd' -> 'q'
                'q' -> 'd'
                else -> 'b'
            }
        } else {
            when (c) {
                'b' -> 'd'
                'd' -> 'b'
                'q' -> 'p'
                else -> 'q'
            }
        }
    )
}