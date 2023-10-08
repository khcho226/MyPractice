fun main() = with(System.`in`.bufferedReader()) {
    var cnt = 0

    repeat(readLine().toInt()) {
        readLine().also {
            if (it.contains("01") || it.contains("OI")) {
                cnt++
            }
        }
    }

    print(cnt)
}