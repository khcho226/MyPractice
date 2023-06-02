import java.util.*

fun main() {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    var k = token.nextToken().toInt()

    for (i in 1..n) {
        if (n % i == 0) {
            k--

            if (k == 0) {
                print(i)
                return
            }
        }
    }

    print(0)
}