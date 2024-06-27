import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val map = hashMapOf(
        0 to "PROBRAIN", 1 to "GROW", 2 to "ARGOS",
        3 to "ADMIN", 4 to "ANT", 5 to "MOTION",
        6 to "SPG", 7 to "COMON", 8 to "ALMIGHTY"
    )
    var maxNum = 0
    var maxIdx = 0

    repeat(9) { idx ->
        StringTokenizer(readLine()).also { st ->
            repeat(n) {
                st.nextToken().toInt().also { num ->
                    if (maxNum < num) {
                        maxNum = num
                        maxIdx = idx
                    }
                }
            }
        }
    }

    print(map[maxIdx])
}