fun main() {
    val set = hashSetOf("ChongChong")

    repeat(readLine()!!.toInt()) {
        val (a, b) = readLine()!!.split(" ")

        if (set.contains(a)) {
            set.add(b)
        } else if (set.contains(b)) {
            set.add(a)
        }
    }

    print(set.size)
}