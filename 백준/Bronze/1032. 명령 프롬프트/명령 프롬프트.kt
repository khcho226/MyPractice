import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val file = readLine().toMutableList()

    repeat(n - 1) {
        readLine().forEachIndexed { idx, c ->
            if (file[idx] != c) {
                file[idx] = '?'
            }
        }
    }

    print(file.joinToString(""))
}
