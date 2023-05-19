fun main() {
    val word = readLine()
    val len = word!!.length

    repeat(len / 2) {
        if (word[it] != word[len - it - 1]) {
            print(0)
            return
        }
    }

    print(1)
}