import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val cnt = readLine().length

    if (cnt >= readLine().length) {
        print("go")
    } else {
        print("no")
    }
}
