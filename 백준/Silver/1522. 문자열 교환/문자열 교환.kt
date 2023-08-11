fun main() = with(System.`in`.bufferedReader()) {
    val line = readLine()
    val numA = line.count { it == 'a' }
    val circle = line + line.substring(0 until numA)
    var min = 1000

    for (i in line.indices) {
        min = minOf(min, circle.substring(i until i + numA).count { it == 'b' })
    }

    print(min)
}
