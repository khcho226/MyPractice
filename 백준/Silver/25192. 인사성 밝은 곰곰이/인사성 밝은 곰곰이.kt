fun main() {
    var set = HashSet<String>()
    var cnt = 0

    repeat(readLine()!!.toInt()) {
        readLine()!!.also {
            if (it == "ENTER") {
                set = HashSet()
            } else if (set.add(it)) {
                cnt++
            }
        }
    }

    print(cnt)
}