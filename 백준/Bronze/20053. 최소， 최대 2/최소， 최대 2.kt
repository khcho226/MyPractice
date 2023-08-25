import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val token = StringTokenizer(readLine())
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE

        repeat(n) {
            token.nextToken().toInt().also {
                if (min > it) {
                    min = it
                }

                if (max < it) {
                    max = it
                }
            }
        }

        answer.append("$min $max\n")
    }

    print(answer)
}