fun main() = with(System.`in`.bufferedReader()) {
    val mbti = readLine()
    var cnt = 0

    repeat(readLine().toInt()) {
        if (readLine() == mbti) {
            cnt++
        }
    }

    print(cnt)
}