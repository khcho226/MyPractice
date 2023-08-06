fun main() = with(System.`in`.bufferedReader()) {
    var (ax, ay) = readLine().split(" ").map { it.toInt() }
    var (bx, by) = readLine().split(" ").map { it.toInt() }

    while (ay > 0 && by > 0) {
        ay -= bx
        by -= ax
    }

    print(
        when {
            ay > 0 -> "PLAYER A"
            by > 0 -> "PLAYER B"
            else -> "DRAW"
        }
    )
}