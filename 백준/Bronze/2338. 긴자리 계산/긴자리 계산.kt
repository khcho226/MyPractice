import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val a = readLine().toBigDecimal()
    val b = readLine().toBigDecimal()

    print("${a + b}\n${a - b}\n${a * b}")
}