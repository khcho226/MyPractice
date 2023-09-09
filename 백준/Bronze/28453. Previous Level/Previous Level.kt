import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    val answer = StringBuilder()

    repeat(n) {
        token.nextToken().toInt().also {
            answer.append(
                if (it >= 300) {
                    "1 "
                } else if (it >= 275) {
                    "2 "
                } else if (it >= 250) {
                    "3 "
                } else {
                    "4 "
                }
            )
        }
    }

    print(answer)
}