import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = StringTokenizer(readLine()).nextToken().toInt()

    repeat(n) {
        val m = StringTokenizer(readLine()).nextToken().toInt()
        val map = mutableMapOf<String, Int>()
        var result = 1

        repeat(m) {
            val token = StringTokenizer(readLine())
            val value = token.nextToken().toString()
            val key = token.nextToken().toString()

            map[key] = map[key]?.plus(1) ?: 1
        }

        map.values.forEach { result *= it + 1 }
        println(result - 1)
    }
}