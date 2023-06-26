import java.util.*

fun main() {
    val answer = StringBuilder()

    repeat(readLine()!!.toInt()) {
        StringTokenizer(readLine()).also {
            val num = it.nextToken().toInt() - it.nextToken().toInt() + it.nextToken().toInt()

            answer.append(
                when {
                    num < 0 -> "advertise\n"
                    num  == 0 -> "does not matter\n"
                    else -> "do not advertise\n"
                }
            )
        }
    }

    print(answer)
}