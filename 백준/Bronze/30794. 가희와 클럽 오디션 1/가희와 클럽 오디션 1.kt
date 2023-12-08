import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val lv = token.nextToken().toInt()
    
    print(
        when (token.nextToken()) {
            "perfect" -> lv * 1000
            "great" -> lv * 600
            "cool" -> lv * 400
            "bad" -> lv * 200
            else -> 0
        }
    )
}