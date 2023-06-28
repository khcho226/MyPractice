fun main() {
    val word = readLine()!!
    val key = readLine()!!
    val answer = StringBuilder()

    word.forEachIndexed { idx, it ->
        answer.append(
            if (it == ' ') {
                ' '
            } else {
                ((it.code - key[idx % key.length].code + 25) % 26 + 97).toChar()
            }
        )
    }

    println(answer)
}