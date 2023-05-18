fun main() {
    while (true) {
        readLine()?.let {
            if (it.isNotBlank()) {
                println(it)
            }
        } ?: break
    }
}