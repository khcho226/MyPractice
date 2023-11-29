import java.io.*
import kotlin.math.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    readLine().also {
        print("The largest square has side length ${sqrt(it.toDouble()).toInt()}.")
    }
}