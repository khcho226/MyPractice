import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    print(getName(readLine()))
}

fun getName(input: String) = when (input) {
    "NLCS" -> "North London Collegiate School"
    "BHA" -> "Branksome Hall Asia"
    "KIS" -> "Korea International School"
    else -> "St. Johnsbury Academy"
}