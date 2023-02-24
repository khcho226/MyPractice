import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    repeat(3) {
        when (readLine().split(" ").sumOf { it.toInt() }) {
            0 -> println("D")
            1 -> println("C")
            2 -> println("B")
            3 -> println("A")
            4 -> println("E")
        }
    }
}