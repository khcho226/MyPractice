import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = IntArray(101) { 1 }
    val answer = StringBuilder()
    var n = readLine().toInt()

    for (i in 2..100) {
        arr[i] = arr[i - 1] + i * i
    }

    while (n != 0) {
        answer.append("${arr[n]}\n")
        n = readLine().toInt()
    }

    print(answer)
}