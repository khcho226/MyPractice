import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val temperatures = readLine().split(" ").map { it.toInt() }
    var max = temperatures.subList(0, 0 + k).sum()
    
    for (i in 1..(n - k)) {
        max = maxOf(max, temperatures.subList(i, i + k).sum())
    }

    print(max)
}