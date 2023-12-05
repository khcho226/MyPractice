import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().toInt().also {
            repeat(it / 5) {
                answer.append("++++ ")
            }
    
            repeat(it % 5) {
                answer.append("|")
            }
        }

        answer.append("\n")
    }

    print(answer)
}