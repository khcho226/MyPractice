import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    readLine().toLong().also {
        var now = readLine().toInt()

        if (it < 6) {
            repeat(it.toInt() - 1) {
                now = 1 - now
                answer.append("$now\n")
            }
        } else {
            answer.append("Love is open door")
        }
    }

    print(answer)
}