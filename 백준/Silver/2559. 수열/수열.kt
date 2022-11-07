import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val arr1 = IntArray(n + k)
    val arr2 = IntArray(n + 1)

    token = StringTokenizer(readLine())
    repeat(n) {
        val temp = token.nextToken().toInt()

        arr1[it + k] = temp
        arr2[it + 1] = arr2[it] - arr1[it] + temp
    }
    println(arr2.copyOfRange(k, arr2.size).maxOrNull())
}