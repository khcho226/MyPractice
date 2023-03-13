import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine()

    for (i in 0 until n.length - 1) {
        val x = n.substring(0, i + 1).fold(1) { total, it -> total * (it - '0')}
        val y = n.substring(i + 1).fold(1) { total, it -> total * (it - '0')}

        if (x == y) {
            print("YES")
            return@run
        }
    }

    print("NO")
}