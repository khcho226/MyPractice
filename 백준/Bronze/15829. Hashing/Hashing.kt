fun main() = with(System.`in`.bufferedReader()) {
    var total = 0L
    var exp = 1L

    readLine()
    readLine().forEach {
        total = (total + (it - 'a' + 1) * exp) % 1234567891
        exp = exp * 31 % 1234567891
    }

    print(total)
}