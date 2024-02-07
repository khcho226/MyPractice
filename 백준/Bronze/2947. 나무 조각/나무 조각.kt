import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val st = StringTokenizer(readLine())
    val arr1 = IntArray(5) { st.nextToken().toInt() }
    val arr2 = IntArray(5) { it + 1 }
    val sb = StringBuilder()
    var temp: Int

    while (arr1.contentEquals(arr2).not()) {
        for (i in 0..3) {
            if (arr1[i] > arr1[i + 1]) {
                temp = arr1[i]
                arr1[i] = arr1[i + 1]
                arr1[i + 1] = temp
                sb.append("${arr1.joinToString(" ")}\n")
            }
        }
    }

    print(sb)
}