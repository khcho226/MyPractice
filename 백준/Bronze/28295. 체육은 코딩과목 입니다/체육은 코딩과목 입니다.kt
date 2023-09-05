fun main() = with(System.`in`.bufferedReader()) {
    val dir = arrayOf("S", "W", "N", "E")
    var idx = 10

    repeat(10) {
        when (readLine()) {
            "1" -> idx++
            "3" -> idx--
            else -> idx += 2
        }
    }

    print(dir[idx % 4])
}