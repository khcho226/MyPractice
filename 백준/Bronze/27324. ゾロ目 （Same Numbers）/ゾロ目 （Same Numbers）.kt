import java.io.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    readLine().also {
        print(
            if (it[0] == it[1]) {
                1
            } else {
                0
            }
        )
    }
}