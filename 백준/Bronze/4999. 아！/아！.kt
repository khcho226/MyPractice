import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val cnt = readLine().count { it == 'a' }

    if (cnt >= readLine().count { it == 'a' }) {
        print("go")
    } else {
        print("no")
    }
}
