import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val line = readLine()
    var cnt1 = 0
    var cnt2 = 0

    if (line.length >= 3) {
        for (i in 0..line.length - 3) {
            if (line[i] == ':' && line[i + 1] == '-') {
                if (line[i + 2] == ')') {
                    cnt1++
                } else if (line[i + 2] == '(') {
                    cnt2++
                }
            }
        }
    }

    print(
        if (cnt1 == 0 && cnt2 == 0) {
            "none"
        } else if (cnt1 > cnt2) {
            "happy"
        } else if (cnt1 < cnt2) {
            "sad"
        } else {
            "unsure"
        }
    )
}