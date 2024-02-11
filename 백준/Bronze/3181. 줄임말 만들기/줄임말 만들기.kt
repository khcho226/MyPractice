import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()
    val st = StringTokenizer(readLine())
    val arr = arrayOf("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili")

    sb.append(st.nextToken()[0].uppercase())

    while (st.hasMoreTokens()) {
        st.nextToken().also {
            if (arr.contains(it).not()) {
                sb.append(it[0].uppercase())
            }
        }
    }

    print(sb)
}