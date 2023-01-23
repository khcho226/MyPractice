import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val pList = readLine().split(" ").map { it.toInt() }
    val x = StringTokenizer(readLine()).nextToken().toInt()

    if (pList.contains(x)) {
        print(pList.indexOf(x) + 1)
    } else {
        print(0)
    }
}