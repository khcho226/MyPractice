import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(StringTokenizer(readLine()).nextToken().toInt()) {
        val p = StringTokenizer(readLine()).nextToken().toString()
        val n = StringTokenizer(readLine()).nextToken().toInt()
        val list = StringTokenizer(readLine()).nextToken().toString().replace("[", "").replace("]", "").split(",").toMutableList()
        var rCount = 0

        if (p.count { it == 'D' } > n) {
            answer.append("error\n")
            return@repeat
        }

        p.forEach {
            if (it == 'R') {
                rCount++
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