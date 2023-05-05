fun main() {
    val (h, m) = readLine()!!.split(" ").map { it.toInt() }

    print((h - 9) * 60 + m)
}