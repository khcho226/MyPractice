import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val p = token.nextToken().toInt()
        val m = token.nextToken().toInt()
        val arr = BooleanArray(m + 1)
        var cnt = 0

        repeat(p) {
            readLine().toInt().also {
                if (arr[it].not()) {
                    arr[it] = true
                } else {
                    cnt++
                }
            }
        }

        println(cnt)
    }
}