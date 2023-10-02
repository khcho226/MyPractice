fun main() = with(System.`in`.bufferedReader()) {
    val map = mapOf(
        "M" to "MatKor",
        "W" to "WiCys",
        "C" to "CyKor",
        "A" to "AlKor",
        "$" to "\$clear"
    )

    print(map[readLine()])
}