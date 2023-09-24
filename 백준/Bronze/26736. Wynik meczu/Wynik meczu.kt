fun main() = with(System.`in`.bufferedReader()) {
    var cntA = 0
    var cntB = 0

    readLine().forEach {
        if (it == 'A') {
            cntA++
        } else {
            cntB++
        }
    }

    print("$cntA : $cntB")
}