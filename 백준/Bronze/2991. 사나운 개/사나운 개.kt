import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    val d = token.nextToken().toInt()
    val answer = StringBuilder()

    StringTokenizer(readLine()).also { st ->
        repeat(3) {
            var cnt = 0

            st.nextToken().toInt().also {
                if (it % (a + b) in 1..a) {
                    cnt++
                }

                if (it % (c + d) in 1..c) {
                    cnt++
                }
            }

            answer.append("$cnt\n")
        }
    }

    print(answer)
}