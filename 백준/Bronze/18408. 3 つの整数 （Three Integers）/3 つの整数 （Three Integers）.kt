import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var cnt1 = 0
    var cnt2 = 0

    StringTokenizer(readLine()).also { st ->
        repeat(3) {
            if (st.nextToken() == "1") {
                cnt1++
            } else {
                cnt2++
            }
        }
    }

    print(
        if (cnt1 > cnt2) {
            "1"
        } else {
            "2"
        }
    )
}