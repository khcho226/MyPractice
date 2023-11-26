import java.util.*

fun main() {
    val answer = StringBuilder()

    repeat(readLine()!!.toInt()) {
        StringTokenizer(readLine()).also { st ->
            st.nextToken().also {
                answer.append("$it $it")
            }

            answer.append("\n")
        }
    }

    print(answer)
}