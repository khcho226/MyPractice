fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a + b + c != 180) {
        print("Error")
    } else if (a == b && b == c && c == 60) {
        print("Equilateral")
    } else if (a == b || b == c || c == a) {
        print("Isosceles")
    } else {
        print("Scalene")
    }
}