import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val size = StringTokenizer(readLine()).nextToken().toInt()
    val router = ArrayDeque<Int>()

    while (true) {
        val input = StringTokenizer(readLine()).nextToken().toInt()

        if (input == -1) {
            break
        } else if (input == 0) {
            router.pollLast()
        } else if (router.size < size) {
            router.push(input)
        }
    }

    if (router.isEmpty()) {
        println("empty")
    } else {
        println(router.reversed().joinToString(" "))
    }
}