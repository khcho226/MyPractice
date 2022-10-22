fun main() {
    val k = readLine()!!.split(" ").map { it.toInt() }[1]
    val list = readLine()!!.split(" ").map { it.toInt() }.sorted()

    println(list[list.size - k])
}