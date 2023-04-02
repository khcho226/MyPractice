import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    var n = readLine().toInt()

    while (n != 0) {
        for (i in 1..n) {
            repeat(i) { answer.append("*") }
            answer.append("\n")
        }

        n = readLine().toInt()
    }

    print(answer)
}