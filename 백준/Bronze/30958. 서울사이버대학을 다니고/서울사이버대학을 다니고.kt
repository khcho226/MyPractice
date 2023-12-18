import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = IntArray(26)

    readLine()
    readLine().forEach {
        if (it.isLowerCase()) {
            arr[it - 'a']++
        }
    }

    print(arr.maxOf { it })
}