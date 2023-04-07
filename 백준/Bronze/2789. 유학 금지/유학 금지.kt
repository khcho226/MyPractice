import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    print(readLine().replace("[CAMBRIDGE]".toRegex(), ""))
}