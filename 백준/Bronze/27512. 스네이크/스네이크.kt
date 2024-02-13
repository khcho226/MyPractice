import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val num = st.nextToken().toInt() * st.nextToken().toInt()

    print(
        if (num % 2 == 0) {
            num
        } else {
            num - 1
        }
    )
}