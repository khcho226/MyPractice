import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        var total = 0

        StringTokenizer(readLine()).also {
            while (it.hasMoreTokens()) {
                total += it.nextToken().toInt()
            }
        }

        answer.append("$total\n")
    }

    print(answer)
}