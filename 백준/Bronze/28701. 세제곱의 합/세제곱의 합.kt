fun main() = with(System.`in`.bufferedReader()) {
    var a = 0
    var b = 0

    for (i in 1..readLine().toInt()) {
        a += i
        b += i * i * i
    }

    print("${a}\n${a * a}\n${b}")
}