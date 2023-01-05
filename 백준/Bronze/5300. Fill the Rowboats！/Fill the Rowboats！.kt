import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = StringBuilder()

    repeat(n - 1) {
        answer.append("${it + 1} ")

        if (it % 6 == 5) {
            answer.append("Go! ")
        }
    }

    answer.append("$n Go!")
    print(answer)
}