import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toLong()

    print(((3 * n * n + 5 * n + 2) / 2) % 45678)
}