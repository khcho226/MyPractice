import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val num = readLine().toInt()
    var answer = 1L

    repeat(num) { answer *= it + 1}
    print(answer)
}
