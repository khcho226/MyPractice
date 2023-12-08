import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var s = readLine()

    StringTokenizer(readLine()).also { st ->
        while (st.hasMoreTokens()) {
            st.nextToken().also {
                s = s.replace(it, it.lowercase())
            }
        }
    }

    print(s)
}