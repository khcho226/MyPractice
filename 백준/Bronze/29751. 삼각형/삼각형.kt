import java.io.*
import java.util.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    StringTokenizer(readLine()).also {
        print(it.nextToken().toDouble() * it.nextToken().toDouble() / 2)
    }
}