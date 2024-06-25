import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val s = st.nextToken()
    var cnt = 0

    repeat(n) {
        StringTokenizer(readLine()).also { st2 ->
            if (st2.nextToken().split("_").contains(s)) {
                cnt += st2.nextToken().toInt()
            }
        }
    }

    print(cnt)
}