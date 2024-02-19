import java.io.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    readLine().split(" ").sorted().also {
        print(it[0].toInt() * it[2].toInt())
    }
}