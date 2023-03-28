import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().toInt().toString(2).reversed().forEachIndexed { idx, c ->
            if (c == '1') {
                answer.append("$idx ")
            }
        }
        answer.append("\n")
    }
    print(answer)
}