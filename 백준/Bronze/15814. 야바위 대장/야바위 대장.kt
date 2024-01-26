import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = readLine().toCharArray()

    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).also { st ->
            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()
            val t = arr[a]

            arr[a] = arr[b]
            arr[b] = t
        }
    }

    print(arr.joinToString(""))
}