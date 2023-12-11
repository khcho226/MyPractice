import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val stA = StringTokenizer(readLine())
    val stB = StringTokenizer(readLine())
    var cnt = 0
    
    repeat(n) {
        if (stA.nextToken().toInt() <= stB.nextToken().toInt()) {
            cnt++
        }
    }
    
    print(cnt)
}