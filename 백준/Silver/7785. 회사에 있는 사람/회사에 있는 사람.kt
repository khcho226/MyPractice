import java.util.*

fun main() {
    val set = sortedSetOf<String>(reverseOrder())

    repeat(readLine()!!.toInt()) {
        StringTokenizer(readLine()).also {
            val name = it.nextToken()
            val type = it.nextToken()

            if (type == "enter") {
                set.add(name)
            } else {
                set.remove(name)
            }
        }
    }

    print(set.joinToString("\n"))
}