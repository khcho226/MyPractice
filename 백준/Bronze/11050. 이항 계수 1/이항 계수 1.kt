import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    println(factorial(n) / (factorial(k) * factorial(n - k)))
}

fun factorial(input: Int): Int {
    var x = input
    var result = 1

    while (x > 1) {
        result *= x
        x -= 1
    }

    return result
}