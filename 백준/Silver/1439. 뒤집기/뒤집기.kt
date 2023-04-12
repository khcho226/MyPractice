import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var now = ' '
    var num0 = 0
    var num1 = 0

    readLine().forEach {
        if (now != it) {
            now = it

            if (it == '0') {
                num0++
            } else {
                num1++
            }
        }
    }

    print(minOf(num0, num1))
}