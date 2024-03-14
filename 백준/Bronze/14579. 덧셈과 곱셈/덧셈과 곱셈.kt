import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    var num = a * (a - 1) / 2
    var total = 1

    for (i in a..b) {
        num += i
        total = (total * num) % 14579
    }

    print(total)
}