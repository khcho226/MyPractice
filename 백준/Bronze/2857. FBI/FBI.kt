fun main(): Unit = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(5) { i ->
        readLine().also {
            if (it.contains("FBI")) {
                answer.append("${i + 1} ")
            }
        }
    }

    print(
        answer.ifEmpty {
            "HE GOT AWAY!"
        }
    )
}