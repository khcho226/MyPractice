import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    while (true) {
        val n = readLine().toInt()

        if (n == 0) {
            break
        }

        answer.append("${n * (n + 1) / 2}\n")
    }

    print(answer)
}