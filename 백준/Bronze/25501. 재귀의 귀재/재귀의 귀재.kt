fun main() {
    val n = readLine()!!.toInt()

    repeat(n) {
        val x = readLine()!!.toString()
        val result = recursion(x, 0, x.length - 1, 1)
    }
}

fun recursion(x: String, l: Int, r: Int, n: Int) {
    if (l >= r) {
        println("1 $n")
    } else if (x[l] != x[r]) {
        println("0 $n")
    } else {
        recursion(x, l + 1, r - 1, n + 1)
    }
}