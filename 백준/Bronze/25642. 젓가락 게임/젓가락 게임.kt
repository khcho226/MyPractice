import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    var a = st.nextToken().toInt()
    var b = st.nextToken().toInt()

    while (true) {
        b += a

        if (b >= 5) {
            print("yt")
            break
        }

        a += b

        if (a >= 5) {
            print("yj")
            break
        }
    }
}