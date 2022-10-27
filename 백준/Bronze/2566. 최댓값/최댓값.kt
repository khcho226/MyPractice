import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var max = 0
    var maxRow = 0
    var maxCol = 0

    for (i in 0..8) {
        val token = StringTokenizer(readLine())

        for (j in 0..8) {
            val temp = token.nextToken().toInt()

            if (temp > max) {
                max = temp
                maxRow = i
                maxCol = j
            }
        }
    }

    println("${max}\n${maxRow + 1} ${maxCol + 1}")
}