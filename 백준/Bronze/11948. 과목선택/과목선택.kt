fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    val e = readLine()!!.toInt()
    val f = readLine()!!.toInt()

    print(a + b + c + d - minOf(a, b, c, d) + maxOf(e, f))
}