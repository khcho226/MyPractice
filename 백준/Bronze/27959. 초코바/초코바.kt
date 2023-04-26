fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    if (100 * n >= m) {
        print("Yes")
    } else {
        print("No")
    }
}