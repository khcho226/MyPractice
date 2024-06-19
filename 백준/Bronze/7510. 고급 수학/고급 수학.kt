import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        val arr = readLine().split(" ").map { it.toInt() }.sorted()

        sb.append(
            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                "Scenario #${it + 1}:\nyes\n\n"
            } else {
                "Scenario #${it + 1}:\nno\n\n"
            }
        )
    }

    print(sb)
}