import java.io.*
import java.util.*
import kotlin.collections.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    while (true) {
        val st = StringTokenizer(readLine())
        val n = st.nextToken().toInt()
        var prev = 0

        if (n == 0) {
            break
        }

        repeat(n) {
            st.nextToken().toInt().also { num ->
                if (prev != num) {
                    sb.append("$num ")
                }

                prev = num
            }
        }

        sb.append("$\n")
    }

    print(sb)
}