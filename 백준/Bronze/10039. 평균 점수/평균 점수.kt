import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var total = 0

    repeat(5) { total += maxOf(readLine().toInt(), 40) }
    print(total / 5)
}