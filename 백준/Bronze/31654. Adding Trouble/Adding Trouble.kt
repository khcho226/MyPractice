import java.io.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    readLine().split(" ").map { it.toInt() }.also {
        print(
            if (it[0] + it[1] == it[2]) {
                "correct!"
            } else {
                "wrong!"
            }
        )
    }
}