fun main() {
    var score = 0
    var idx = 0

    repeat(5) { it ->
        val total = readLine()!!.split(" ").sumOf { it.toInt() }

        if (score < total) {
            score = total
            idx = it + 1
        }
    }

    print("$idx $score")
}