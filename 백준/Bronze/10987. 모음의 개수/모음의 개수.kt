import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = arrayOf('a', 'e', 'i', 'o', 'u')
    var cnt = 0

    readLine().forEach {
        if (arr.contains(it)) {
            cnt++
        }
    }

    print(cnt)
}