import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (a, b) = readLine().split(" ").map { it.toBigInteger() }

    print(a.multiply(b))
}
