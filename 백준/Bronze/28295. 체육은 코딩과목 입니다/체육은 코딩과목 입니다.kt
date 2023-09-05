fun main() = with(System.`in`.bufferedReader()) {
    val dir = arrayOf("N", "E", "S", "W")
    var idx = 0

    repeat(10) {
        idx += readLine().toInt()
    }

    print(dir[idx % 4])
}