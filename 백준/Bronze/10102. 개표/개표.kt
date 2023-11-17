fun main() = with(System.`in`.bufferedReader()) {
    var cntA = 0
    var cntB = 0

    readLine()
    readLine().forEach {
        if (it == 'A') {
            cntA++
        } else {
            cntB++
        }
    }

    print(
        when {
            cntA > cntB -> "A"
            cntA < cntB -> "B"
            else -> "Tie"
        }
    )
}