import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    print(
        if (readLine().startsWith("555")) {
            "YES"
        } else {
            "NO"
        }
    )
}