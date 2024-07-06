import java.io.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    readLine().split("\"").also {
        print(
            if (it.size == 3 && it[0].isBlank() && it[1].isNotBlank() && it[2].isBlank()) {
                it[1]
            } else {
                "CE"
            }
        )
    }
}