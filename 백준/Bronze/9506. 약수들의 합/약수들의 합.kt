fun main() {
    val answer = StringBuilder()
    var n = readLine()!!.toInt()

    while (n != -1) {
        val arr = arrayListOf<Int>()

        for (i in 1 until n) {
            if (n % i == 0) {
                arr.add(i)
            }
        }

        if (n == arr.sum()) {
            answer.append("$n = ${arr.joinToString(" + ")}\n")
        } else {
            answer.append("$n is NOT perfect.\n")
        }

        n = readLine()!!.toInt()
    }

    print(answer)
}