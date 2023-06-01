fun main() {
    val l = readLine()!!.split(" ").map { it.toInt() }

    for (x in -999..999) {
        for (y in -999..999) {
            if (l[0] * x + l[1] * y == l[2] && l[3] * x + l[4] * y == l[5]) {
                print("$x $y")
                return
            }
        }
    }
}