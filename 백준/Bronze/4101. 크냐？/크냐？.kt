import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    while (true) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        if (a == 0 && b == 0) {
            break
        } else if (a > b) {
            answer.append("Yes\n")
        } else {
            answer.append("No\n")
        }
    }

    println(answer)
}