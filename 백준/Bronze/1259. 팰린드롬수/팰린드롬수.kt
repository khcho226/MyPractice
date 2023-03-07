import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    var n = readLine()

    while (n != "0") {
        if (n == n.reversed()) {
            answer.append("yes\n")
        } else {
            answer.append("no\n")
        }

        n = readLine()
    }

    print(answer)
}