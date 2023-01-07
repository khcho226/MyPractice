import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val x = readLine().toInt()
    val y = readLine().toInt()

    print(2 * y - x)
}