fun main() {
    val answer = StringBuilder()

    repeat(readLine()!!.toInt()) {
        readLine()!!.also { 
            answer.append(
                if (it[it.length / 2 - 1] == it[it.length / 2]) {
                    "Do-it\n"
                } else {
                    "Do-it-Not\n"
                }
            )
        }
    }

    print(answer)
}