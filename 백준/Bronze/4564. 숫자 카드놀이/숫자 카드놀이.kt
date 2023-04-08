import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val answer = StringBuilder()
    var num = readLine()

    while (num != "0") {
        var beforeNum = num

        while (beforeNum.length != 1) {
            var afterNum = 1

            answer.append("$beforeNum ")
            beforeNum.forEach { afterNum *= (it - '0') }
            beforeNum = afterNum.toString()
        }

        answer.append("${beforeNum}\n")
        num = readLine()
    }

    print(answer)
}