import java.io.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val colors = listOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
    val first = colors.indexOf(readLine()).toLong()
    val second = colors.indexOf(readLine()).toLong()
    val third = colors.indexOf(readLine())

    print((10 * first + second) * 10.0.pow(third).toLong())
}