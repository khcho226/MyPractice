import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    val lines = mutableListOf<String>()
    var max = 0

    repeat(5) {
        val line = readLine()

        lines.add(line)
        max = maxOf(max, line.length)
    }

    repeat(max) {
        lines.forEach { line ->
            if (line.length > it) {
                answer.append(line[it])
            }
        }
    }

    print(answer)
}