import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()
    val n = readLine().toInt()
    var x = readLine().toInt()

    while (x != 0) {
        sb.append(
            if (x % n == 0) {
                "$x is a multiple of $n.\n"
            } else {
                "$x is NOT a multiple of $n.\n"
            }
        )

        x = readLine().toInt()
    }

    print(sb)
}