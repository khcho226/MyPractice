fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var total = 0

    repeat(n) {
        total += readLine().toInt()
    }

    print(total + 1 - n)
}