fun main() = with(System.`in`.bufferedReader()) {
    val line = readLine()
    var isM = false
    var isO = false
    var isB = false
    var isI = false
    var isS = false

    line.forEach {
        when (it) {
            'M' -> isM = true
            'O' -> isO = true
            'B' -> isB = true
            'I' -> isI = true
            'S' -> isS = true
        }
    }

    print(
        if (isM && isO && isB && isI && isS) {
            "YES"
        } else {
            "NO"
        }
    )
}