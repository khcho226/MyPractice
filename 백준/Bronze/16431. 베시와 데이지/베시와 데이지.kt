import kotlin.math.*

fun main() = with(System.`in`.bufferedReader()) {
    val (bx, by) = readLine().split(" ").map { it.toInt() }
    val (dx, dy) = readLine().split(" ").map { it.toInt() }
    val (jx, jy) = readLine().split(" ").map { it.toInt() }
    val bt = maxOf(abs(bx - jx), abs(by - jy))
    val dt = abs(dx - jx) + abs(dy - jy)

    print(
        if (bt < dt) {
            "bessie"
        } else if (bt > dt) {
            "daisy"
        } else {
            "tie"
        }
    )
}