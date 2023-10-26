fun main(): Unit = with(System.`in`.bufferedReader()) {
    readLine().also {
        print(
            if (it.contains("7").not()) {
                if (it.toInt() % 7 != 0) {
                    "0"
                } else {
                    "1"
                }
            } else {
                if (it.toInt() % 7 != 0) {
                    "2"
                } else {
                    "3"
                }
            }
        )
    }
}