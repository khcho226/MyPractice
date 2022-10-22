fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toInt() }.sorted()

    println(list[list.size - input[1]])
}