import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val arr = IntArray(n + m)

    StringTokenizer(readLine()).also { st ->
        repeat(n) {
            arr[it] += st.nextToken().toInt()
        }
    }

    repeat(n) { idxI ->
        StringTokenizer(readLine()).also { st ->
            repeat(n + m) { idxJ ->
                st.nextToken().toInt().also {
                    arr[idxI] -= it
                    arr[idxJ] += it
                }
            }
        }
    }

    print(arr.joinToString(" "))
}