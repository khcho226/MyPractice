fun main(): Unit = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(" ").map { it.toInt() }
    val (k, x) = readLine().split(" ").map { it.toInt() }
    
    (minOf(b, k + x) - maxOf(a, k - x)).also {
        print(
            if (it >= 0) {
                it + 1
            } else {
                "IMPOSSIBLE"
            }
        )
    }
}