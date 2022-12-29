import java.io.*
import kotlin.math.ceil

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val l = readLine().toInt()
    val a = readLine().toDouble()
    val b = readLine().toDouble()
    val c = readLine().toInt()
    val d = readLine().toInt()
    
    print(l - maxOf(ceil(a / c), ceil(b / d)).toInt())
}