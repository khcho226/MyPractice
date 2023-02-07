import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var num = readLine()
    val answer = StringBuilder()

    while (num.length % 3 != 0) {
        num = "0$num"
    }

    repeat(num.length / 3) { answer.append(num.substring(3 * it, 3 * it + 3).toInt(2).toString(8)) }
    print(answer)
}