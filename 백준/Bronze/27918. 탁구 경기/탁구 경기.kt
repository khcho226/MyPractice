import java.io.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var cntD = 0
    var cntP = 0

    for (i in 1..readLine().toInt()) {
        if (readLine() == "D") {
            cntD++
        } else {
            cntP++
        }

        if (abs(cntD - cntP) == 2) {
            break
        }
    }

    print("${cntD}:${cntP}")
}