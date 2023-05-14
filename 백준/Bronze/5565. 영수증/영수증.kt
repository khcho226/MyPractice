fun main() {
    var total = readLine()!!.toInt()

    repeat(9) { total -= readLine()!!.toInt() }
    print(total)
}