import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    readLine().forEach { answer.append("${reversed(it)}") }
    print(answer)
}

fun reversed(input: Char) =
    when (input) {
        'E' -> 'I'
        'I' -> 'E'
        'S' -> 'N'
        'N' -> 'S'
        'T' -> 'F'
        'F' -> 'T'
        'J' -> 'P'
        else -> 'J'
    }