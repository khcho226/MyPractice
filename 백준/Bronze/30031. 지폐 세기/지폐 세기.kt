fun main() = with(System.`in`.bufferedReader()) {
    var total = 0

    repeat(readLine().toInt()) {
        readLine().take(3).also {
            total += when (it) {
                "136" -> 1000
                "142" -> 5000
                "148" -> 10000
                else -> 50000
            }
        }
    }

    print(total)
}