import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        var score = 0

        readLine().forEach { c ->
            if (c.isUpperCase()) {
                score += c + 1 - 'A'
            }
        }

        sb.append(
            if (score == 100) {
                "PERFECT LIFE\n"
            } else {
                "$score\n"
            }
        )
    }

    print(sb)
}