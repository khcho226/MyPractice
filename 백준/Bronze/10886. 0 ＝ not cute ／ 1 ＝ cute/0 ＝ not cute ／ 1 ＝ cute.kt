fun main() = with(System.`in`.bufferedReader()) {
    var cnt = 0

    repeat(readLine().toInt()) {
        if (readLine().toInt() == 1) {
            cnt++
        } else {
            cnt--
        }
    }

    print(
        if (cnt > 0) {
            "Junhee is cute!"
        } else {
            "Junhee is not cute!"
        }
    )
}