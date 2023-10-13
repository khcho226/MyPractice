fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()
    
    repeat(readLine().toInt()) {
        readLine().toInt().also {
            answer.append(
                if (it % 2 == 0) {
                    "$it is even\n"
                } else {
                    "$it is odd\n"
                }
            )
        }
    }

    print(answer)
}