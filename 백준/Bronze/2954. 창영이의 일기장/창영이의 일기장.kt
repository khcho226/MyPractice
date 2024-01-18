import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = arrayOf("a", "e", "i", "o", "u")
    var line = readLine()

    arr.forEach {
        line = line.replace("${it}p${it}", it)
    }

    print(line)
}