fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().also {
            answer.append("${it[0].code + it[2].code - 96}\n")
        }
    }

    print(answer)
}