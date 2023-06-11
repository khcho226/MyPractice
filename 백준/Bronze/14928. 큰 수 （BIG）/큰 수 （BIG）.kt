fun main() {
    var remain = 0L

    for (i in readLine()!!) {
        remain = (remain * 10 + (i - '0')) % 20000303
    }

    print(remain)
}