import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    val arr = arrayOf(
        arrayOf(10), arrayOf(1), arrayOf(6, 2, 4, 8), arrayOf(1, 3, 9, 7), arrayOf(6, 4),
        arrayOf(5), arrayOf(6), arrayOf(1, 7, 9, 3), arrayOf(6, 8, 4, 2), arrayOf(1, 9)
    )

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt() % 10
        val b = token.nextToken().toInt()

        answer.append("${arr[a][b % arr[a].size]}\n")
    }
    print(answer)
}