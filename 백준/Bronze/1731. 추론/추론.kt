import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = readLine().toInt()
    }

    print(
        if (arr[1] - arr[0] == arr[2] - arr[1]) {
            arr.last() + arr[1] - arr[0]
        } else {
            arr.last() * (arr[1] / arr[0])
        }
    )
}