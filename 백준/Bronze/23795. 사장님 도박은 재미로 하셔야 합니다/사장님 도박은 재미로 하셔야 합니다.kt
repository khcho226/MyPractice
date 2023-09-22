fun main() = with(System.`in`.bufferedReader()) {
    var total = 0
    var n = readLine().toInt()

    while (n != -1) {
        total += n
        n = readLine().toInt()
    }

    print(total)
}