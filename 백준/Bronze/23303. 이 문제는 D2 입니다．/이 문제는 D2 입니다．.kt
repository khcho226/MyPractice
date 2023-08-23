fun main() = with(System.`in`.bufferedReader()) {
    val line = readLine()

    print(
        if (line.contains("D2") || line.contains("d2")) {
            "D2"
        } else {
            "unrated"
        }
    )
}