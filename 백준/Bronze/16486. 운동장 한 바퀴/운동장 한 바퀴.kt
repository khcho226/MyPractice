import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val a = readLine().toDouble()
    val b = readLine().toDouble()

    print(a * 2 + b * 6.283184)
}