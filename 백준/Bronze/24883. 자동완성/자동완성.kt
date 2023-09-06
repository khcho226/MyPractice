fun main(): Unit = with(System.`in`.bufferedReader()) {
    readLine().also {
        print(
            if (it == "N" || it == "n") {
                "Naver D2"
            } else {
                "Naver Whale"
            }
        )
    }
}