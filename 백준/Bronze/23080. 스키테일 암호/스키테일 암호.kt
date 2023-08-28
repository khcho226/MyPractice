fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val code = readLine()
    val answer = StringBuilder()

    code.forEachIndexed { idx, c ->
        if (idx % n == 0) {
            answer.append(c)
        }
    }
    
    print(answer)
}