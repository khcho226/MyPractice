import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken().toInt()

        answer.append(
            if (a + b + c == 180) {
                "$a $b $c Seems OK\n"
            } else {
                "$a $b $c Check\n"
            }
        )
    }

    print(answer)
}