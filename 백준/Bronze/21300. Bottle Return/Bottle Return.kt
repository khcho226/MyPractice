import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var total = 0

    StringTokenizer(readLine()).also { st ->
        repeat(6) {
            total += st.nextToken().toInt()
        }
    }
    
    print(total * 5)
}