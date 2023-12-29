import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val arr = arrayListOf<Int>()

    StringTokenizer(readLine()).also { st ->
        for (i in 1..n) {
            arr.add(st.nextToken().toInt(), i)
        }
    }

    print(arr.reversed().joinToString(" "))
}