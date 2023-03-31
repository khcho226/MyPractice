import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (t, s) = readLine().split(" ").map { it.toInt() }

    if (t in 12..16 && s == 0) {
        print(320)
    } else {
        print(280)
    }
}