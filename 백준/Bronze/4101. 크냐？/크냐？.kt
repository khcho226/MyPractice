import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    while (true) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        if (a == 0 && b == 0) {
            break
        } else if (a > b) {
            println("Yes")
        } else {
            println("No")
        }
    }
}