import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) { _ ->
        val arr = IntArray(26)
        var total = 0

        readLine().forEach { arr[it.code - 65] = 1 }
        arr.forEachIndexed { idx, it ->
            if (it == 0) {
                total += idx + 65
            }
        }
        answer.append("${total}\n")
    }
    print(answer)
}