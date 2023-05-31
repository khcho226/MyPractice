fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    if (a <= c && b <= (c - a) * n) {
        print(1)
    } else {
        print(0)
    }
}