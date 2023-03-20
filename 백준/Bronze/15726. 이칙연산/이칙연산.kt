import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (a, b, c) = readLine().split(" ").map { it.toDouble() }

    print(maxOf((a * b / c).toInt(), (a / b * c).toInt()))
}