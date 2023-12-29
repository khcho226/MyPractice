import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    repeat(3) {
        var now = ' '
        var cnt = 1
        var maxCnt = 1

        readLine().forEach {
            if (now != it) {
                now = it
                cnt = 1
            } else {
                cnt++
            }

            maxCnt = maxOf(maxCnt, cnt)
        }

        println(maxCnt)
    }
}