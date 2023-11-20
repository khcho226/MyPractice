fun main(): Unit = with(System.`in`.bufferedReader()) {
    readLine().toInt().also {
        print(
            when {
                620 <= it -> "Red"
                590 <= it -> "Orange"
                570 <= it -> "Yellow"
                495 <= it -> "Green"
                450 <= it -> "Blue"
                425 <= it -> "Indigo"
                else -> "Violet"
            }
        )
    }
}