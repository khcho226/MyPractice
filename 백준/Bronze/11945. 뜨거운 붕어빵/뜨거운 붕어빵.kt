fun main() {
    val n = readLine()!!.split(" ")[0].toInt()

    repeat(n) { println(readLine()!!.reversed()) }
}