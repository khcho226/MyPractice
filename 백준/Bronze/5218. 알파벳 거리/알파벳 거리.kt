import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val w1 = st.nextToken()
        val w2 = st.nextToken()

        sb.append("Distances:")
        
        w1.forEachIndexed { idx, c ->
            sb.append(" ${(w2[idx] - c + 26) % 26}")
        }
        
        sb.append("\n")
    }

    print(sb)
}