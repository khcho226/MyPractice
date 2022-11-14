import java.io.*
import java.util.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()

    token = StringTokenizer(readLine())

    val r1 = token.nextToken().toInt()

    repeat(n - 1) {
        val rTemp = token.nextToken().toInt()
        val num = gcd(max(r1, rTemp), min(r1, rTemp))

        println("${r1 / num}/${rTemp / num}")
    }
}

fun gcd(a: Int, b: Int): Int {
    return if (b != 0) {
        gcd(b, a % b)
    } else {
        a
    }
}