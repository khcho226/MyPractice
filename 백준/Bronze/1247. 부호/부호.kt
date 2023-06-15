import java.math.*

fun main() {
    val answer = StringBuilder()

    repeat(3) {
        var total = BigInteger.ZERO

        repeat(readLine()!!.toInt()) {
            total += readLine()!!.toBigInteger()
        }

        answer.append(
            when {
                total > BigInteger.ZERO -> "+\n"
                total < BigInteger.ZERO -> "-\n"
                else -> "0\n"
            }
        )
    }

    print(answer)
}