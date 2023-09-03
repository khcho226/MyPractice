fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    readLine().forEach {
        if (it.isUpperCase()) {
            answer.append(it)
        }
    }

    print(answer)
}