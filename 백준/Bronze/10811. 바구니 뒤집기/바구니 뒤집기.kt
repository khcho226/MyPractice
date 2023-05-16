fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val arr = IntArray(n) { it + 1 }

    repeat(m) {
        val (i, j) = readLine()!!.split(" ").map { it.toInt() - 1 }

        arr.slice(i..j).forEachIndexed { idx, it ->
            arr[j - idx] = it
        }
    }

    print(arr.joinToString(" "))
}