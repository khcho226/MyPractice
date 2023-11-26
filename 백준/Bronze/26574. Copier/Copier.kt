import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    
    repeat(readLine().toInt()) {
        readLine().also {
            answer.append("$it $it\n")
        }
    }
    
    print(answer)
}