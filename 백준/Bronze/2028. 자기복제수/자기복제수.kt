import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val square = (n * n).toString()

        if (n.toString() == square.substring(square.length - n.toString().length)) {
            answer.append("YES\n")
        } else {
            answer.append("NO\n")
        }
    }

    print(answer)
}
