import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var score = readLine().toInt() * -64

    readLine().forEach { score += it.code }
    print(score)
}