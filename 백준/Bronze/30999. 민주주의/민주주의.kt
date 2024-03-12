import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val m = (st.nextToken().toInt() + 1) / 2
    var cnt = 0

    repeat(n) {
        if (readLine().count { it == 'O' } >= m) {
            cnt++
        }
    }
    
    print(cnt)
}