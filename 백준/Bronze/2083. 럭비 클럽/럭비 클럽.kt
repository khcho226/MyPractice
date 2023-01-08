import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()

    while (true) {
        val token = StringTokenizer(readLine())
        val name = token.nextToken().toString()
        val age = token.nextToken().toInt()
        val weight = token.nextToken().toInt()

        if (name == "#") {
            break
        }

        answer.append(name)

        if (age >= 18 || weight >= 80) {
            answer.append(" Senior\n")
        } else {
            answer.append(" Junior\n")
        }
    }

    print(answer)
}