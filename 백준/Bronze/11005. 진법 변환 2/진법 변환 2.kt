import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toLong()
    val b = token.nextToken().toInt()

    print(n.toString(b).uppercase(Locale.getDefault()))
}