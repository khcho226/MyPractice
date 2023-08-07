import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val lenW = token.nextToken().toInt()
    val lenS = token.nextToken().toInt()
    val arrW = IntArray(58).also { arr ->
        readLine().forEach {
            arr[it - 'A']++
        }
    }
    val arrS = IntArray(58)
    val s = readLine()
    var cnt = 0

    for (i in 0 until lenS) {
        arrS[s[i] - 'A']++

        if (i >= lenW - 1) {
            if (arrW.contentEquals(arrS)) {
                cnt++
            }

            arrS[s[i - lenW + 1] - 'A']--
        }
    }

    print(cnt)
}