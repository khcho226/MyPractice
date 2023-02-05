import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val arr = IntArray(10)

        readLine().forEach { arr[it - '0']++ }
        answer.append("${arr.count { it != 0 }}\n")
    }
    print(answer)
}