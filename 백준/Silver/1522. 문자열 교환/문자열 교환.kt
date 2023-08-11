fun main() = with(System.`in`.bufferedReader()) {
    val line = readLine()
    val numA = line.count { it == 'a' }
    val circle = line + line.substring(0 until numA)
    var cntB = circle.substring(0 until numA).count { it == 'b' }
    var min = cntB

    for (i in 1 until line.length) {
        if (circle[i + numA - 1] == 'b') {
            cntB++
        }
        
        if (circle[i - 1] == 'b') {
            cntB--
        }

        min = minOf(min, cntB)
    }

    print(min)
}