import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine()).nextToken().toString()
    val answer = StringBuilder()

    token.forEach {
        if (it.isUpperCase()) {
            answer.append(it.lowercaseChar())
        } else {
            answer.append(it.uppercaseChar())
        }
    }

    println(answer)
}