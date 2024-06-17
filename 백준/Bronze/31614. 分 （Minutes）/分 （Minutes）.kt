import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    print(readLine().toInt() * 60 + readLine().toInt())
}