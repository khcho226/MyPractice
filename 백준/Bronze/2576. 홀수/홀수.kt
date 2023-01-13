import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var sum = 0
    var min = 100

    repeat(7) {
        val n = readLine().toInt()

        if (n % 2 == 1) {
            sum += n
            min = minOf(min, n)
        }
    }

    if (sum != 0) {
        print("${sum}\n$min")
    } else {
        print(-1)
    }
}