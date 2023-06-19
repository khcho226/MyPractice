import java.util.*

fun main() {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val min = token.nextToken().toInt()
    val max = token.nextToken().toInt()
    val t = token.nextToken().toInt()
    val r = token.nextToken().toInt()
    var now = min
    var total = 0
    var cnt = 0

    if (now + t > max) {
        print(-1)
        return
    }

    while (n != cnt) {
        total++

        if (now + t <= max) {
            now += t
            cnt++
        } else {
            now = maxOf(now - r, min)
        }
    }

    print(total)
}