import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine().toInt()
    val answer = arrayListOf<String>()

    repeat(n - 1) {
        answer.add((it + 1).toString())

        if (it % 6 == 5) {
            answer.add("Go!")
        }
    }

    answer.add("$n Go!")
    print(answer.joinToString(" "))
}