import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val a = readLine()
    val b = readLine()
    val c = readLine().toInt()

    println(a.toInt() + b.toInt() - c)
    println((a + b).toInt() - c)
}