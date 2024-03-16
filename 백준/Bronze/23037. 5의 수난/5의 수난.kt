import java.io.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var total = 0.0

    readLine().forEach {
        total += (it - '0').toDouble().pow(5.0)
    }

    print(total.toInt())
}