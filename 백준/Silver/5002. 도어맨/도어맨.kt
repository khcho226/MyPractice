import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val line = readLine().toCharArray()
    var cntM = 0
    var cntW = 0

    for (i in line.indices) {
        if (line[i] == 'M') {
            cntM++
        } else {
            cntW++
        }

        if (abs(cntM - cntW) <= n) {
            continue
        }

        if (i != line.lastIndex && line[i] != line[i + 1]) {
            line[i + 1] = line[i]

            if (line[i] == 'M') {
                cntM--
                cntW++
            } else {
                cntM++
                cntW--
            }
        } else {
            cntM--
            break
        }
    }

    print(cntM + cntW)
}