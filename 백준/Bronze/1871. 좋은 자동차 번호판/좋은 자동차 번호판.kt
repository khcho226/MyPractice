import java.io.*
import kotlin.math.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        val arr = readLine().split("-")
        var s = 0

        arr[0].forEachIndexed { idx, it ->
            s += 26f.pow(2 - idx).toInt() * (it - 'A')
        }

        sb.append(
            if (abs(arr[1].toInt() - s) <= 100) {
                "nice\n"
            } else {
                "not nice\n"
            }
        )
    }

    print(sb)
}