fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()
    var n = readLine()

    while (n != "0") {
        var len = n.length + 1

        n.forEach {
            len += when (it) {
                '0' -> 4
                '1' -> 2
                else -> 3
            }
        }

        answer.append("$len\n")
        n = readLine()
    }

    print(answer)
}