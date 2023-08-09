fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var exp = 0L
    var hash = 0L

    readLine().forEachIndexed { idx, c ->
        exp = if (idx == 0) {
            1L
        } else {
            exp * 31 % 1234567891
        }
        hash = (hash + (c - 'a' + 1) * exp) % 1234567891
    }

    print(hash)
}