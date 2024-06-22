import java.io.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    print(
        when (readLine().toDouble() / readLine().toDouble().pow(2)) {
            in 25.0..Double.MAX_VALUE -> "Overweight"
            in Double.MIN_VALUE..18.5 -> "Underweight"
            else -> "Normal weight"
        }
    )
}