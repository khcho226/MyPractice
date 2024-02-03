import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val arr = listOf(1, 0, 0)

    readLine().forEach { c ->
        when (c) {
            'A' -> Collections.swap(arr, 0, 1)
            'B' -> Collections.swap(arr, 1, 2)
            'C' -> Collections.swap(arr, 2, 0)
        }
    }

    print(arr.indexOf(1) + 1)
}