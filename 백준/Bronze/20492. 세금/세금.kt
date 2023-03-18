import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()

    print("${(n * 0.78).toInt()} ${(n * 0.956).toInt()}")
}