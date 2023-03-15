import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var score = 0

    repeat(5) { score += readLine().toInt() }
    print(score)
}