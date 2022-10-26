fun main() {
    val num = readLine()!!.split(" ").map { it.toInt() }
    val list1 = mutableListOf<List<Int>>()
    val list2 = mutableListOf<List<Int>>()

    repeat(num[0]) { list1.add(readLine()!!.split(" ").map { it.toInt() }) }
    repeat(num[0]) { list2.add(readLine()!!.split(" ").map { it.toInt() }) }

    list1.forEachIndexed { idx1, it1 ->
        it1.forEachIndexed { idx2, it2 ->
            print("${it2 + list2[idx1][idx2]} ")
        }
        println()
    }
}