import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var answer = 0

    repeat(2) {
        val token = StringTokenizer(readLine())
        var score = 0

        repeat(4) { score += token.nextToken().toInt() }
        answer = maxOf(answer, score)
    }

    print(answer)
}