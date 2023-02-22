import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    while (true) {
        val line = readLine()

        if (line == "END") {
            break
        }

        answer.append("${line.reversed()}\n")
    }

    print(answer)
}