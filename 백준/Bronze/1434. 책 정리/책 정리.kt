import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val boxes = IntArray(n)
    var idx = 0

    StringTokenizer(readLine()).also { st ->
        for (i in 0 until n) {
            boxes[i] = st.nextToken().toInt()
        }
    }

    StringTokenizer(readLine()).also { st ->
        repeat(m) {
            st.nextToken().toInt().also { book ->
                while (idx < n) {
                    if (boxes[idx] >= book) {
                        boxes[idx] -= book
                        break
                    }
    
                    idx++
                }
            }
        }
    }

    print(boxes.sum())
}