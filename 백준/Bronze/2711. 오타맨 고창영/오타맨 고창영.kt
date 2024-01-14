import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val n = st.nextToken().toInt()

        sb.append("${st.nextToken().removeRange(n - 1, n)}\n")
    }

    print(sb)
}