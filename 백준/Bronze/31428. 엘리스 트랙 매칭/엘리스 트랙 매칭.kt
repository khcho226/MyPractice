import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val a = readLine()
    var cnt = 0

    repeat(n) {
        if (st.nextToken() == a) {
            cnt++
        }
    }

    print(cnt)
}