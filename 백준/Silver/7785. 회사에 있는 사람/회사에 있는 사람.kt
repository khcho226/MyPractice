fun main() {
    val set = HashSet<String>()

    repeat(readLine()!!.toInt()) {
        readLine()!!.split(" ").also {
            if (it[1] == "enter") {
                set.add(it[0])
            } else {
                set.remove(it[0])
            }
        }
    }

    print(set.sortedDescending().joinToString("\n"))
}