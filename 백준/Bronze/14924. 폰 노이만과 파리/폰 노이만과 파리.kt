import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (s, t, d) = readLine().split(" ").map { it.toInt() }

    print(t * d / (s * 2))
}