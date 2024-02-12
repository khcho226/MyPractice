import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val temp = st.nextToken() + " " + st.nextToken()

        while (st.hasMoreTokens()) {
            sb.append(st.nextToken() + " ")
        }

        sb.append(temp + "\n")
    }

    print(sb)
}