import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    var name: String
    var numG: Int
    var numB: Int

    repeat(readLine().toInt()) {
        name = readLine()
        numG = 0
        numB = 0

        name.lowercase().forEach {
            if (it == 'g') {
                numG++
            } else if (it == 'b') {
                numB++
            }
        }

        if (numG > numB) {
            answer.append("$name is GOOD\n")
        } else if (numG < numB) {
            answer.append("$name is A BADDY\n")
        } else {
            answer.append("$name is NEUTRAL\n")
        }
    }
    print(answer)
}