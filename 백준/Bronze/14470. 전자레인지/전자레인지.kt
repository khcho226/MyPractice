fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    val e = readLine()!!.toInt()

    if (a < 0) {
        print(-1 * a * c + d + b * e)
    } else {
        print((b - a) * e)
    }
}