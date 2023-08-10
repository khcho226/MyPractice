fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    readLine().forEachIndexed { idx, it ->
        answer.append(it)

        if (idx % 10 == 9) {
            answer.append("\n")
        }
    }

    print(answer)
}