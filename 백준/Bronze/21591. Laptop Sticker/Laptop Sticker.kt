import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val wc = st.nextToken().toInt()
    val hc = st.nextToken().toInt()
    val ws = st.nextToken().toInt()
    val hs = st.nextToken().toInt()

    print(
        if (wc < ws + 2 || hc < hs + 2) {
            0
        } else {
            1
        }
    )
}