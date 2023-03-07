import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val name = readLine().toCharArray()

    repeat(n - 1) {
        readLine().forEachIndexed { idx, c ->
            if (name[idx] != c) {
                name[idx] = '?'
            }
        }
    }

    print(name)
}
