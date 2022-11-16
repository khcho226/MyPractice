import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val num = arrayListOf(1, 2, 4)

    repeat(999997) {
        num.add(((num[it].toLong() + num[it + 1] + num[it + 2]) % 1000000009).toInt())
    }

    var token = StringTokenizer(readLine())
    val answer = StringBuilder()

    repeat(token.nextToken().toInt()) {
        token = StringTokenizer(readLine())
        answer.append("${num[token.nextToken().toInt() - 1]}\n")
    }

    println(answer)
}