import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    var line = readLine()

    while (line != "#") {
        val cnt = line.count { it == '1' }
        
        if ((line.last() == 'e' && cnt % 2 == 0) || (line.last() == 'o' && cnt % 2 == 1)) {
            answer.append("${line.dropLast(1)}0\n")
        } else {
            answer.append("${line.dropLast(1)}1\n")
        }

        line = readLine()
    }

    print(answer)
}