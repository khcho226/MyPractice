fun main() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { IntArray(n + 1) }
    var max = -1000

    for (r in 1..n) {
        val lst = readLine()!!.split(" ").map { it.toInt() }

        for (c in 1..n) {
            arr[r][c] = lst[c - 1] + arr[r][c - 1] + arr[r - 1][c] - arr[r - 1][c - 1]
        }
    }

    for (k in 1..n) {
        for (r in k..n) {
            for (c in k..n) {
                max = maxOf(max, arr[r][c] + arr[r - k][c - k] - arr[r][c - k] - arr[r - k][c])
            }
        }
    }

    println(max)
}