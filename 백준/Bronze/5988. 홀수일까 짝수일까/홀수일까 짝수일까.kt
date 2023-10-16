fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().also {
            answer.append(
                if (it[it.length - 1].code % 2 == 0) {
                    "even\n"
                } else {
                    "odd\n"
                }
            )
        }
    }

    print(answer)
}