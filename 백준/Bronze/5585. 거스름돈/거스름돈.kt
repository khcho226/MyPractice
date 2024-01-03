import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = arrayOf(500, 100, 50, 10, 5, 1)
    var cnt = 0
    var change = 1000 - readLine().toInt()

    arr.forEach {
        cnt += change / it
        change %= it
    }

    println(cnt)
}