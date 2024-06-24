import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = Stack<Int>()

    repeat(readLine().toInt()) {
        readLine().toInt().also { num ->
            while (st.isNotEmpty() && st.peek() <= num) {
                st.pop()
            }

            st.push(num)
        }
    }

    print(st.size)
}