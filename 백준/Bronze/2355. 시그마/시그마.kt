import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (a, b) = readLine().split(" ").map { it.toLong() }

    print((a + b) * (maxOf(a, b) - minOf(a, b) + 1) / 2)
}