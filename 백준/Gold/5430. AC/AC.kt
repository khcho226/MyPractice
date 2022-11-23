import java.io.*
import java.util.*
import kotlin.collections.ArrayDeque

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(StringTokenizer(readLine()).nextToken().toInt()) {
        val p = StringTokenizer(readLine()).nextToken().toString()
        val n = StringTokenizer(readLine()).nextToken().toInt()
        val arr = ArrayDeque(StringTokenizer(readLine(), "[],").run { List(n) { nextToken() }})
        var rCount = 0

        p.forEach {
            if (it == 'R') {
                rCount++
            } else if (arr.isEmpty()) {
                answer.append("error\n")
                return@repeat
            } else if (rCount % 2 == 0) {
                arr.removeFirst()
            } else {
                arr.removeLast()
            }
        }

        if (rCount % 2 == 1) {
            arr.reverse()
        }

        answer.append("[${arr.joinToString(",")}]\n")
    }

    println(answer)
}