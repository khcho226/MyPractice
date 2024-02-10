import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val score = readLine()
    var cnt = 1

    while (true) {
        if (st.nextToken() == score) {
            break
        }

        cnt++
    }

    print(
        if (cnt <= 5) {
            "A+"
        } else if (cnt <= 15) {
            "A0"
        } else if (cnt <= 30) {
            "B+"
        } else if (cnt <= 35) {
            "B0"
        } else if (cnt <= 45) {
            "C+"
        } else if (cnt <= 48) {
            "C0"
        } else {
            "F"
        }
    )
}