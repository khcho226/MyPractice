import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()
    var arr = readLine().split(" ").map { it.toInt() }
    var cnt = 1

    while (arr[0] != 0) {
        sb.append("Hole #${cnt}\n${calc(arr[0], arr[1])}\n\n")
        arr = readLine().split(" ").map { it.toInt() }
        cnt++
    }

    print(sb)
}

fun calc(p: Int, s: Int): String {
    return if (s == 1) {
        "Hole-in-one."
    } else {
        when (p - s) {
            3 -> "Double eagle."
            2 -> "Eagle."
            1 -> "Birdie."
            0 -> "Par."
            -1 -> "Bogey."
            else -> "Double Bogey."
        }
    }
}