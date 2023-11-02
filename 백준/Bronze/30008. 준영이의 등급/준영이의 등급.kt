import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val answer = StringBuilder()

    StringTokenizer(readLine()).also { st ->
        repeat(k) {
            answer.append(
                when (st.nextToken().toInt() * 100 / n) {
                    in 0..4 -> "1 "
                    in 5..11 -> "2 "
                    in 12..23 -> "3 "
                    in 24..40 -> "4 "
                    in 41..60 -> "5 "
                    in 61..77 -> "6 "
                    in 78..89 -> "7 "
                    in 90..96 -> "8 "
                    else -> "9 "
                }
            )
        }
    }

    print(answer)
}