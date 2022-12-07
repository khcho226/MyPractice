import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine()).nextToken().toString()

    print(":fan::fan::fan:\n:fan::${token}::fan:\n:fan::fan::fan:")
}