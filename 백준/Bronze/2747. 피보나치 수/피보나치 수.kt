import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var a = 0
    var b = 1
    var temp: Int
    var cnt = 1
    val n = readLine().toInt()

    while (true) {
        if (cnt == n) {
            print(b)
            break
        }

        temp = a + b
        a = b
        b = temp
        cnt++
    }
}