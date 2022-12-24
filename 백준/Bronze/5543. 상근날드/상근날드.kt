import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()
    val d = readLine().toInt()
    val e = readLine().toInt()

    println(minOf(a, b, c) + minOf(d, e) - 50)
}