import java.util.*

fun main() {
    val answer = StringBuilder()
    var token: StringTokenizer
    var a: Int
    var b: Int
    var gcd: Int

    repeat(readLine()!!.toInt()) {
        token = StringTokenizer(readLine())
        a = token.nextToken().toInt()
        b = token.nextToken().toInt()
        gcd = gcd(a, b)
        answer.append("${a * b / gcd} ${gcd}\n")
    }

    print(answer)
}

fun gcd(a: Int, b: Int): Int {
    return if (b != 0) {
        gcd(b, a % b)
    } else {
        a
    }
}