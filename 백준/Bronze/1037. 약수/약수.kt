import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val list = mutableListOf<Int>()
    val n = StringTokenizer(readLine()).nextToken().toInt()
    val token = StringTokenizer(readLine())

    repeat(n) { list.add(token.nextToken().toInt()) }
    list.sort()
    
    println(list[0] * list[list.lastIndex])
}