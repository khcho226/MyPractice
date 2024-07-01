import java.io.*
import java.util.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    StringTokenizer(readLine()).also { st ->
        print(
            if (st.nextToken().toInt() % st.nextToken().toInt() == 0) {
                "Yes"
            } else {
                "No"
            }
        )
    }
}