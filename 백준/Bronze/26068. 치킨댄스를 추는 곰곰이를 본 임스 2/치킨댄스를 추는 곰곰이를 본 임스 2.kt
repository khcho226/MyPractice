import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var cnt = 0

    repeat(readLine().toInt()) {
        if (readLine().drop(2).toInt() <= 90) {
            cnt++
        }
    }

    print(cnt)
}