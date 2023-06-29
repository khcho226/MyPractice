fun main() {
    val prices = listOf(350.34, 230.90, 190.55, 125.30, 180.90)
    val answer = StringBuilder()

    repeat(readLine()!!.toInt()) {
        var total = 0.0

        readLine()!!.split(" ").forEachIndexed { idx, it ->
            total += prices[idx] * it.toInt()
        }

        answer.append("$${String.format("%.2f", total)}\n")
    }

    println(answer)
}