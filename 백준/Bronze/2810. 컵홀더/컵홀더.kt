fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cnt = readLine().replace("LL", " ").count { it == ' ' }

    print(minOf(n, n - cnt + 1))
}