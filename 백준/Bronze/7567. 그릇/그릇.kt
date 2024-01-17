import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var cur = ' '
    var total = 0

    readLine().forEach {
        if (cur != it) {
            cur = it
            total += 10
        } else {
            total += 5
        }
    }

    print(total)
}