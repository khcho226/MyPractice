import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    repeat(readLine().toInt()) {
        val num = readLine()
        var cnt = 0

        readLine().forEachIndexed { idx, c ->
            if (num[idx] != c) {
                cnt++
            }
        }

        println("Hamming distance is ${cnt}.")
    }
}