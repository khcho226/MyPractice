import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val lst = LinkedList<Int>()

    StringTokenizer(readLine()).also { st ->
        for (i in 1..n) {
            lst.add(st.nextToken().toInt(), i)
        }
    }

    print(lst.reversed().joinToString(" "))
}