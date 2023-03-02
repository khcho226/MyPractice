import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    var pos = 1

    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }

        if (pos == x) {
            pos = y
        } else if (pos == y) {
            pos = x
        }
    }

    print(pos)
}
