import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val x = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    var target = x

    repeat(k) {
        StringTokenizer(readLine()).also {
            val a = it.nextToken().toInt()
            val b = it.nextToken().toInt()
    
            if (target == a) {
                target = b
            } else if (target == b) {
                target = a
            }
        }
    }

    print(target)
}