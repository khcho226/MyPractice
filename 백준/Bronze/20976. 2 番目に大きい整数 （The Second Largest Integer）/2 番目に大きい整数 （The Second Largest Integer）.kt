fun main() = with(System.`in`.bufferedReader()) {
    print(readLine().split(" ").map { it.toInt() }.sorted()[1])
}