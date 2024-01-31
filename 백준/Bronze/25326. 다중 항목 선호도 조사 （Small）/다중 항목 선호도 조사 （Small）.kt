import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val arr = arrayListOf<Array<String>>()
    val sb = StringBuilder()

    repeat(n) {
        StringTokenizer(readLine()).also { st ->
            arr.add(arrayOf(st.nextToken(), st.nextToken(), st.nextToken()))
        }
    }

    repeat(m) {
        StringTokenizer(readLine()).also { st ->
            val arrT = arrayOf(st.nextToken(), st.nextToken(), st.nextToken())
            var total = 0

            for (t in arr) {
                var cnt = 0

                for (i in 0..2) {
                    if (arrT[i] == t[i] || arrT[i] == "-") {
                        cnt++
                    }
                }

                if (cnt == 3) {
                    total++
                }
            }

            sb.append("$total\n")
        }
    }

    print(sb)
}