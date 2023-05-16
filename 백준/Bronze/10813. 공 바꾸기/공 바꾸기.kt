fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val arr = IntArray(n) { it + 1 }

    repeat(m) {
        val (i, j) = readLine()!!.split(" ").map { it.toInt() }
        val temp = arr[i - 1]

        arr[i - 1] = arr[j - 1]
        arr[j - 1] = temp
    }

    print(arr.joinToString(" "))
}