import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = listOf('a', 'e', 'i', 'o', 'u')
    val answer = StringBuilder()
    var line = readLine()
    var cnt = 0

    while (line != "#") {
        line.lowercase().forEach {
            if (arr.contains(it)) {
                cnt++
            }
        }
        answer.append("${cnt}\n")
        line = readLine()
        cnt = 0
    }

    print(answer)
}