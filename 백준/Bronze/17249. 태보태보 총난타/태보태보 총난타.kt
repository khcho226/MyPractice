import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = IntArray(2)
    var idx = 0

    readLine().forEach {
        if (it == '@') {
            arr[idx]++
        } else if (it == '0') {
            idx++
        }
    }

    print(arr.joinToString(" "))
}