fun main() = with(System.`in`.bufferedReader()) {
    val lst = readLine().split(" ").map { it.toInt() }.sorted()

    readLine().forEach {
        print("${lst[it - 'A']} ")
    }
}