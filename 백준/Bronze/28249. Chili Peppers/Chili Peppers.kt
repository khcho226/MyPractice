import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val map = mapOf(
        "Poblano" to 1500, "Mirasol" to 6000, "Serrano" to 15500,
        "Cayenne" to 40000, "Thai" to 75000, "Habanero" to 125000
    )
    var total = 0

    repeat(readLine().toInt()) {
        total += map[readLine()]!!
    }

    print(total)
}