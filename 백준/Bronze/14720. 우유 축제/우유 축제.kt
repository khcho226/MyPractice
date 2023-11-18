import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var cnt = 0

    StringTokenizer(readLine()).also { st ->
        repeat(n) {
            if (cnt % 3 == st.nextToken().toInt()) {
                cnt++
            }
        }
    }

    print(cnt)
}