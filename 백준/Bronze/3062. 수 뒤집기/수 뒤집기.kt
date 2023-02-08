import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    repeat(readLine().toInt()) {
        val input = readLine()
        val num = (input.toInt() + input.reversed().toInt()).toString()
        var isChecked = true

        for (i in 0..(num.length / 2)) {
            if (num[i] != num[num.length - i - 1]) {
                isChecked = false
                break
            }
        }

        if (isChecked) {
            answer.append("YES\n")
        } else {
            answer.append("NO\n")
        }
    }
    print(answer)
}