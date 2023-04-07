import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val name = StringBuilder()
    val arr = arrayOf('A', 'B', 'C', 'D', 'E', 'G', 'I', 'M', 'R')

    readLine().forEach {
        if (arr.contains(it).not()) {
            name.append(it)
        }
    }

    print(name)
}