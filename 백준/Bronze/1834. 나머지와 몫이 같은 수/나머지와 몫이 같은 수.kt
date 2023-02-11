import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toLong()

    print((n - 1) * n * (n + 1) / 2)
}