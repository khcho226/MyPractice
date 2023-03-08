import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    
    print(n * m - 1)
}