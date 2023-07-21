import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val w = token.nextToken().toLong()
    val h = token.nextToken().toLong()
    val f = token.nextToken().toLong()
    val c = token.nextToken().toLong()
    val x1 = token.nextToken().toLong()
    val y1 = token.nextToken().toLong()
    val x2 = token.nextToken().toLong()
    val y2 = token.nextToken().toLong()
    val area = w * h - (x2 - x1) * (y2 - y1) * (c + 1)

    print(
        if (f <= w / 2) {
            if (f <= x1) {
                area
            } else {
                area - (minOf(f, x2) - x1) * (y2 - y1) * (c + 1)
            }
        } else {
            if (w <= x1 + f) {
                area
            } else {
                area - (minOf(w, f + x2) - f - x1) * (y2 - y1) * (c + 1)
            }
        }
    )
}