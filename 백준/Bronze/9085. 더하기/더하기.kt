import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    
    repeat(readLine().toInt()) {
        readLine()
        answer.append("${readLine().split(" ").fold(0) { total, num -> total + num.toInt() }}\n")
    }
    print(answer)
}