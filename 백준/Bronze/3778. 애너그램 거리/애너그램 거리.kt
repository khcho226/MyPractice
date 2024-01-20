import java.io.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    for (i in 1..readLine().toInt()) {
        val arr1 = IntArray(26)
        val arr2 = IntArray(26)
        var cnt = 0

        readLine().forEach { arr1[it - 'a']++ }
        readLine().forEach { arr2[it - 'a']++ }
        arr1.zip(arr2).forEach { cnt += abs(it.first - it.second) }
        sb.append("Case #${i}: ${cnt}\n")
    }

    print(sb)
}