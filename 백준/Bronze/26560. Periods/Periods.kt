import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().also {
            answer.append(
                if (it.last() == '.') {
                    "$it\n"
                } else {
                    "$it.\n"
                }
            )
        }
    }

    print(answer)
}