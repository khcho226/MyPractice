import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    var a: Int
    var b: Int

    while (true) {
        StringTokenizer(readLine()).also {
            a = it.nextToken().toInt()
            b = it.nextToken().toInt()
        }

        if (a == 0 && b == 0) {
            break
        }

        answer.append("${minOf(a, b) * 2 - maxOf(a, b)}\n")
    }

    print(answer)
}