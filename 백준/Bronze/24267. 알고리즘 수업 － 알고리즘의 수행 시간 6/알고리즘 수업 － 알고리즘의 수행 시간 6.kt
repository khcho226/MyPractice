fun main() {
    readLine()!!.toLong().let {
        print("${it * (it - 1) * (it - 2) / 6}\n3")
    }
}