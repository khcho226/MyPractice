fun main() = with(System.`in`.bufferedReader()) {
    val line = readLine()
    var cnt = 1

    for (i in 0 until line.length - 1) {
        if (line[i] == line[i + 1]) {
            cnt++
        } else {
            break
        }
    }

    print(cnt)
}