import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    
    print(token.nextToken().toLong() + token.nextToken().toLong() + token.nextToken().toLong())
}