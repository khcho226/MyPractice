import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val size = StringTokenizer(readLine()).nextToken().toInt()
    val router = arrayListOf<Int>()

    while (true) {
        val input = StringTokenizer(readLine()).nextToken().toInt()

        if (input == -1) {
            break
        } else {
            if (input == 0 && router.isNotEmpty()) {
                router.removeAt(0)
            } else if (router.size < size) {
                router.add(input)
            }
        }
    }

    if (router.isEmpty()) {
        println("empty")
    } else {
        router.forEach { print("$it ") }
    }
}