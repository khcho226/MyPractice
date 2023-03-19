import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = listOf('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u')
    val answer = StringBuilder()
    var line = readLine()
    var cnt = 0

    while (line != "#") {
        line.forEach {
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