var num = 0

fun main() {
    val n = readLine()!!.toInt()

    fib(n)
    print("$num ${n - 2}")
}

fun fib(n: Int): Int {
    return if (n == 1 || n == 2) {
        num++
        1
    } else {
        fib(n - 1) + fib(n - 2)
    }
}