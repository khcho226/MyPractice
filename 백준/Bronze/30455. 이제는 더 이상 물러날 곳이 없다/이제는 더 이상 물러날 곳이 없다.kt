import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    print(
        if (readLine().toInt() % 2 == 1) {
            "Goose"
        } else {
            "Duck"
        }
    )
}