import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    for (i in 1..readLine().toInt()) {
        val s = readLine()

        if (s.contains("S")) {
            print(s)
            break
        }
    }
}