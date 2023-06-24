fun main() {
    val answer = StringBuilder()
    var line = readLine()

    while (line != "***") {
        answer.append("${line!!.reversed()}\n")
        line = readLine()
    }

    print(answer)
}