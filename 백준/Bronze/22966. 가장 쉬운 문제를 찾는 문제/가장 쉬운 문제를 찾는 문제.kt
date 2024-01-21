import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var maxT = ""
    var maxD = Int.MAX_VALUE

    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val t = st.nextToken()
        val d = st.nextToken().toInt()

        if (maxD > d) {
            maxT = t
            maxD = d
        }
    }

    print(maxT)
}