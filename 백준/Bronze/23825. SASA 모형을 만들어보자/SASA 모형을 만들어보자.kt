import java.io.*
import java.util.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    StringTokenizer(readLine()).apply {
        print(minOf(this.nextToken().toInt(), this.nextToken().toInt()) / 2)
    }
}