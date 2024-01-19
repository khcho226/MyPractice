import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().also {
            if (it.startsWith("Simon says")) {
                sb.append("${it.substring(10)}\n")
            }
        }
    }

    print(sb)
}