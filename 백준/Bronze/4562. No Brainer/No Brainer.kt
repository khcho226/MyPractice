import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).also {
            answer.append(
                if (it.nextToken().toInt() < it.nextToken().toInt()) {
                    "NO BRAINS\n"
                } else {
                    "MMM BRAINS\n"
                }
            )
        }
    }

    print(answer)
}