import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    readLine().forEach {
        answer.append(((it.code - 42) % 26 + 65).toChar())
    }

    print(answer)
}