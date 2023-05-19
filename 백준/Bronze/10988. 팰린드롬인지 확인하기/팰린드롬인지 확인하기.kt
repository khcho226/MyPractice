fun main() {
    val word = readLine()

    repeat(word!!.length / 2) {
        if (word[it] != word[word.length - it - 1]) {
            print(0)
            return
        }
    }

    print(1)
}