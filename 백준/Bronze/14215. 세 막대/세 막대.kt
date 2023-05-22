fun main() {
    val lst = readLine()!!.split(" ").map { it.toInt() }.sorted()
    val sum = lst.sum()

    print(minOf(sum, 2 * (sum - lst.max()) - 1))
}