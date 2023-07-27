import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val token = StringTokenizer(readLine())
    var feeY = 0
    var feeM = 0

    repeat(n) {
        token.nextToken().toInt().also {
            feeY += (it / 30 + 1) * 10
            feeM += (it / 60 + 1) * 15
        }
    }

    print(
        when {
            feeY < feeM -> "Y $feeY"
            feeY > feeM -> "M $feeM"
            else -> "Y M $feeY"
        }
    )
}