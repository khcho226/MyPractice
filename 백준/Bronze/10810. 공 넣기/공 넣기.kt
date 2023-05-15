fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val arr = Array(n) { 0 }

    repeat(m) {
        val (i, j, k) = readLine()!!.split(" ").map { it.toInt() }

        for (idx in i - 1 until j) {
            arr[idx] = k
        }
    }

    print(arr.joinToString(" "))
}