import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = IntArray(4)
    val map = mapOf("BANANA" to 0, "LIME" to 1, "PLUM" to 2, "STRAWBERRY" to 3)

    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).also { st ->
            arr[map[st.nextToken()]!!] += st.nextToken().toInt()
        }
    }

    print(
        if (arr.any { it == 5 }) {
            "YES"
        } else {
            "NO"
        }
    )
}