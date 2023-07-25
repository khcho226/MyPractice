fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cnt = readLine().count { it == 'L' } / 2

    print(minOf(n, n - cnt + 1))
}