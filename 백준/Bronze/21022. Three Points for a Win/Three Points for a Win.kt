import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val a = StringTokenizer(readLine())
    val b = StringTokenizer(readLine())
    var score = 0

    repeat(n) {
        val sA = a.nextToken().toInt()
        val sB = b.nextToken().toInt()

        score += when {
            sA > sB -> 3
            sA < sB -> 0
            else -> 1
        }
    }

    print(score)
}