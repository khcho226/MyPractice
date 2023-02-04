import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val tokenA = StringTokenizer(readLine())
    val tokenB = StringTokenizer(readLine())
    var scoreA = 0
    var scoreB = 0
    var winner = "D"

    repeat(10) {
        val a = tokenA.nextToken().toInt()
        val b = tokenB.nextToken().toInt()

        if (a > b) {
            scoreA += 3
            winner = "A"
        } else if (b > a) {
            scoreB += 3
            winner = "B"
        } else {
            scoreA++
            scoreB++
        }
    }

    if (scoreA > scoreB) {
        print("$scoreA ${scoreB}\nA")
    } else if (scoreB > scoreA) {
        print("$scoreA ${scoreB}\nB")
    } else {
        print("$scoreA ${scoreB}\n$winner")
    }
}