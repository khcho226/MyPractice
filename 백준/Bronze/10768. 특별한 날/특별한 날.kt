import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = 30 * readLine().toInt() + readLine().toInt()

    if (n < 78) {
        print("Before")
    } else if (n > 78) {
        print("After")
    } else {
        print("Special")
    }
}