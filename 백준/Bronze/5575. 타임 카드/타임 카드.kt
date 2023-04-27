fun main() {
    val answer = StringBuilder()

    repeat(3) {
        val lst = readLine()!!.split(" ").map { it.toInt() }
        var h = lst[3] - lst[0]
        var m = lst[4] - lst[1]
        var s = lst[5] - lst[2]

        if (s < 0) {
            m--
            s += 60
        }

        if (m < 0) {
            h--
            m += 60
        }

        answer.append("$h $m $s\n")
    }

    print(answer)
}