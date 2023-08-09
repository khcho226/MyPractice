import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val set = mutableSetOf<String>()
    val answer = StringBuilder()
    var n = readLine().toInt()
    var token = StringTokenizer(readLine())

    repeat(n) {
        set.add(token.nextToken())
    }

    n = readLine().toInt()
    token = StringTokenizer(readLine())

    repeat(n) {
        answer.append(
            if (set.contains(token.nextToken())) {
                "1\n"
            } else {
                "0\n"
            }
        )
    }

    print(answer)
}