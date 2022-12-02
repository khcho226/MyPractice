import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val ans = StringBuilder()

    repeat(StringTokenizer(readLine()).nextToken().toInt()) {
        if (StringTokenizer(readLine()).nextToken().toString().length in 6..9) {
            ans.append("yes\n")
        } else {
            ans.append("no\n")
        }
    }

    print(ans)
}