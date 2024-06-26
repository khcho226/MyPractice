import java.io.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        sb.append("${2.0.pow(readLine().toInt()).toInt() - 1}\n")
    }

    print(sb)
}