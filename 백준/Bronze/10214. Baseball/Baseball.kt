import java.util.*

fun main() {
    repeat(readLine()!!.toInt()) {
        var scoreY = 0
        var scoreK = 0

        repeat(9) {
            StringTokenizer(readLine()).also {
                scoreY += it.nextToken().toInt()
                scoreK += it.nextToken().toInt()
            }
        }

        println(
            when {
                scoreY > scoreK -> "Yonsei"
                scoreY < scoreK -> "Korea"
                else -> "Draw"
            }
        )
    }
}