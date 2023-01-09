import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n) { answer.append("${readLine().lowercase(Locale.getDefault())}\n") }
    print(answer)
}