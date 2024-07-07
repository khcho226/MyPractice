import java.io.*
import java.util.*

fun main(): Unit = BufferedReader(InputStreamReader(System.`in`)).run {
    StringTokenizer(readLine()).also { st ->
        repeat(8) {
            if (st.nextToken() == "9") {
                print("F")
                return
            }
        }
    }

    print("S")
}