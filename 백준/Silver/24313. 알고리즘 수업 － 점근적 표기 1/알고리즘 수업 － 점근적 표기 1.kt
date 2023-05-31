fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    if ((c - a) * n >= b && c >= a) {
        print(1)
    } else {
        print(0)
    }
}