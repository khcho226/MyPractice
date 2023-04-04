import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (a, b) = readLine().split(" ").map { it.toLong() }
    val c = readLine().toLong()

    if (a + b < 2 * c) {
        print(a + b)
    } else {
        print(a + b - 2 * c)
    }
}