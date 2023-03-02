import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var pos = 1

    repeat(readLine().toInt()) {
        val (x, y) = readLine().split(" ").map { it.toInt() }

        if (pos == x) {
            pos = y
        } else if (pos == y) {
            pos = x
        }
    }

    print(pos)
}