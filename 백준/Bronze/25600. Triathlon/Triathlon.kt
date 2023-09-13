import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    var max = 0

    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt()
        val d = token.nextToken().toInt()
        val g = token.nextToken().toInt()
        var score = a *  (d + g)

        if (a == d + g) {
            score *= 2
        }

        max = maxOf(max, score)
    }

    print(max)
}