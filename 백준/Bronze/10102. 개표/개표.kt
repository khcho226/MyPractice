fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cntA = readLine().count { it == 'A' }
    val cntB = n - cntA

    print(
        when {
            cntA > cntB -> "A"
            cntA < cntB -> "B"
            else -> "Tie"
        }
    )
}