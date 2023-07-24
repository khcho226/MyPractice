fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val code = readLine()
        val key = readLine().toList()
        val message = code.map {
            if (it == ' ') {
                it
            } else {
                key[it - 'A']
            }
        }.toCharArray()

        answer.append("${String(message)}\n")
    }

    print(answer)
}