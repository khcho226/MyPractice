import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val list = mutableListOf<Int>()

    repeat(5) { list.add(StringTokenizer(readLine()).nextToken().toInt()) }
    list.sort()

    println(list.sum() / 5)
    println(list[2])
}
