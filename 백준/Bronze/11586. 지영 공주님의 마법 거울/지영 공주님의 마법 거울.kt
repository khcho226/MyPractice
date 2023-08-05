fun main() = with(System.`in`.bufferedReader()) {
    val lst = mutableListOf<String>().also { lst ->
        repeat(readLine().toInt()) {
            lst.add(readLine())
        }
    }

    print(
        when (readLine()) {
            "1" -> lst.joinToString("\n")
            "2" -> lst.joinToString("\n") { it.reversed() }
            else -> lst.reversed().joinToString("\n")
        }
    )
}