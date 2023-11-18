import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var target = 0
    var cnt = 0

    StringTokenizer(readLine()).also { st ->
        repeat(n) {
            if (target == st.nextToken().toInt()) {
                target = (target + 1) % 3
                cnt++
            }
        }
    }

    print(cnt)
}