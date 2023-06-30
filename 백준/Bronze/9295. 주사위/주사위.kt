import java.util.*

fun main() {
    val answer = StringBuilder()

    repeat(readLine()!!.toInt()) {
        StringTokenizer(readLine()).also { it2 ->
            answer.append("Case ${it + 1}: ${it2.nextToken().toInt() + it2.nextToken().toInt()}\n")
        }
    }

    println(answer)
}