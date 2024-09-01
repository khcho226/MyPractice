fun main(args: Array<String>) {
    readLine()!!.toInt().also {
        print(
            if (it % 2 == 0) {
                "$it is even"
            } else {
                "$it is odd"
            }
        )
    }
}