fun main() {
    (readLine()!!.toLong() - 2).let {
        print("${(it * it * it + 3 * it * it + 2 * it) / 6}\n3")
    }
}