fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var cnt2 = 0
    var cntE = 0

    readLine().forEach {
        if (it == '2') {
            cnt2++
        } else {
            cntE++
        }
    }

    print(
        if (cnt2 > cntE) {
            "2"
        } else if (cnt2 < cntE) {
            "e"
        } else {
            "yee"
        }
    )
}