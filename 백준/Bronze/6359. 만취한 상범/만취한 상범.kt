import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val rooms = BooleanArray(n + 1)

        for (i in 2..n) {
            for (j in i..n) {
                if (j % i == 0) {
                    rooms[j] = rooms[j].not()
                }
            }
        }

        sb.append("${rooms.count { it.not() } - 1}\n")
    }

    print(sb)
}