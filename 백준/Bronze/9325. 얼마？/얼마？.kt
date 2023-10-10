import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        var total = readLine().toInt()

        repeat(readLine().toInt()) {
            StringTokenizer(readLine()).also {
                total += it.nextToken().toInt() * it.nextToken().toInt()
            }
        }

        answer.append("$total\n")
    }

    print(answer)
}