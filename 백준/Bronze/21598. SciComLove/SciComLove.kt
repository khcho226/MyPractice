fun main() = with(System.`in`.bufferedReader()) {
    print(
        StringBuilder().also { sb ->
            repeat(readLine().toInt()) {
                sb.append("SciComLove\n")
            }
        }
    )
}