import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    var cnt = 1

    while (true) {
        val token = StringTokenizer(readLine())
        val l = token.nextToken().toInt()
        val p = token.nextToken().toInt()
        val v = token.nextToken().toInt()

        if (l == 0) {
            break
        }

        answer.append("Case ${cnt}: ${l * (v / p) + minOf(l, v % p)}\n")
        cnt++
    }

    print(answer)
}