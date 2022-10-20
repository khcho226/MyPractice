fun main() {
    var x = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    repeat(n) {
        var temp = 1

        readLine()!!.split(' ').map { temp *= it.toInt() }
        x -= temp
    }

    if (x == 0) {
        println("Yes")
    } else {
        println("No")
    }
}