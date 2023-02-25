import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var total = readLine().toInt()
    var cnt = 0
    var n = 1

    while (total != 0) {
        if (total < n) {
            n = 1
        }

        total -= n
        cnt++
        n++
    }

    print(cnt)
}