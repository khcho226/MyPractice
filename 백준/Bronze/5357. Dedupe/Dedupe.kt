import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        var prev = ' '

        readLine().forEach { c ->
            if (prev != c)  {
                sb.append(c)
                prev = c
            }
        }

        sb.append("\n")
    }

    print(sb)
}