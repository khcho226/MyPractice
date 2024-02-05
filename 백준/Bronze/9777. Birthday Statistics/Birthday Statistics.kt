import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = IntArray(13)
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).also {
            it.nextToken()
            arr[it.nextToken().split("/")[1].toInt()]++
        }
    }

    for (i in 1..12) {
        answer.append("$i ${arr[i]}\n")
    }

    print(answer)
}