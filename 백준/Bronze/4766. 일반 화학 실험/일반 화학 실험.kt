fun main() {
    val answer = StringBuilder()
    var before = readLine()!!.toDouble()
    var after = readLine()!!.toDouble()

    while (after != 999.0) {
        answer.append("${"%.2f".format(after - before)}\n")
        before = after
        after = readLine()!!.toDouble()
    }

    print(answer)
}