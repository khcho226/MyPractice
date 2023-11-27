import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).also { st ->
            answer.append("${st.nextToken().toLong() + st.nextToken().toLong()}\n")
        }
    }

    print(answer)
}