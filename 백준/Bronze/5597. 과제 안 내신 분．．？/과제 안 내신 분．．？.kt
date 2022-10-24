fun main() {
    val list = Array(30) { 0 }

    repeat(28) { list[readLine()!!.toInt() - 1] = 1 }
    list.forEachIndexed { idx, i ->
        if (i == 0) {
            println(idx + 1)
        }
    }
}