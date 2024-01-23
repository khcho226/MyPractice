import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var score = 0
    var bonus = 0

    readLine()
    readLine().forEachIndexed { i, c ->
        if (c == 'O') {
            score += bonus++ + i + 1
        } else {
            bonus = 0
        }
    }

    print(score)
}