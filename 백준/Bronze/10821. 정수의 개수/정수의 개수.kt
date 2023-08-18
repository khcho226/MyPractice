fun main() = with(System.`in`.bufferedReader()) {
    print(readLine().count { it == ',' } + 1)
}