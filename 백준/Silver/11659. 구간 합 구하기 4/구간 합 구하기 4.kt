import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val arr = mutableListOf<Int>()
    val answer = StringBuilder()

    token = StringTokenizer(readLine())
    repeat(n) { arr.add(token.nextToken().toInt()) }

    val arrSum = IntArray(n + 1)

    arr.forEachIndexed { index, i ->
        arrSum[index + 1] = arrSum[index] + i
    }
    repeat(m) {
        token = StringTokenizer(readLine())

        val j = token.nextToken().toInt()
        val k = token.nextToken().toInt()
        val sum = arrSum[k] - arrSum[j - 1]

        answer.append("${sum}\n")
    }
    println(answer)
}