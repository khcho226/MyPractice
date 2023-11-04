fun main(): Unit = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()
    
    repeat(readLine().toInt()) {
        answer.append("a")
    }
    
    print(answer)
}