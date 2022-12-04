import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = StringTokenizer(readLine()).nextToken().toInt()
    val ans = StringBuilder()

    repeat(n / 4) { ans.append("long ")}
    print(ans.append("int"))
}