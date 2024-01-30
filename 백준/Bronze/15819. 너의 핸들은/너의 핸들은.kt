import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val i = token.nextToken().toInt()
    val pq = PriorityQueue<String>()
    
    repeat(n) {
        pq.offer(readLine())
    }
    
    repeat(i - 1) {
        pq.poll()
    }
    
    print(pq.poll())
}