import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    print(
        if (readLine().toInt() % 7 == 2) {
            1
        } else {
            0
        }
    )
}