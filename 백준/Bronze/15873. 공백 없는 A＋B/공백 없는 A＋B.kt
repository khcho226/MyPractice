fun main() {
    val ab = readLine()!!
    val a: String
    val b: String

    if (ab[1] == '0') {
        a = ab.substring(0, 2)
        b = ab.substring(2)
    } else {
        a = ab.substring(0, 1)
        b = ab.substring(1)
    }

    print(a.toInt() + b.toInt())
}