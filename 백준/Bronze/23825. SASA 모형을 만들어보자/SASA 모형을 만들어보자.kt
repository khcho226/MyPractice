import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (n, m) = readLine().split(" ").map { it.toLong() / 2 }

    print(minOf(n, m))
}