import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val word = readLine()
    val arr = arrayOf('H', 'I', 'N', 'O', 'S', 'X', 'Z')

    for (i in word.indices) {
        if (arr.contains(word[i]).not()) {
            print("NO")
            return
        }
    }

    print("YES")
}