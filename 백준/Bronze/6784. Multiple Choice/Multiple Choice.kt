import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val que: Queue<String> = LinkedList()
    var cnt = 0

    repeat(n) {
        que.offer(readLine())
    }
    
    repeat(n) {
        if (que.poll() == readLine()) {
            cnt++
        }
    }

    print(cnt)
}