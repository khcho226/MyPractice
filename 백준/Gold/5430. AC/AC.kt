import java.io.*
import java.util.*
import kotlin.collections.ArrayDeque

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(StringTokenizer(readLine()).nextToken().toInt()) {
        val p = StringTokenizer(readLine()).nextToken().toString()
        val n = StringTokenizer(readLine()).nextToken().toInt()
        val list = ArrayDeque(StringTokenizer(readLine(), "[],").run { List(n) { nextToken() }})
        var rCount = 0

        p.forEach {
            if (it == 'R') {
                rCount++
            } else if (list.isEmpty()) {
                answer.append("error\n")
                return@repeat
            } else if (rCount % 2 == 0) {
                list.removeFirst()
            } else {
                list.removeLast()
            }
        }

        if (rCount % 2 == 1) {
            list.reverse()
        }

        answer.append("[${list.joinToString(",")}]\n")
    }

    println(answer)
}