import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (n, m) = readLine().split(" ").map { it.toInt() }

    if (m <= 2) {
        print("NEWBIE!")
    } else if (m <= n) {
        print("OLDBIE!")
    } else {
        print("TLE!")
    }
}