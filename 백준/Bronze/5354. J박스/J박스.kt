import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().toInt().also { n ->
            if (n > 1) {
                repeat(n) {
                    sb.append("#")
                }

                sb.append("\n")

                repeat(n - 2) {
                    sb.append("#")

                    repeat(n - 2) {
                        sb.append("J")
                    }

                    sb.append("#\n")
                }
            }

            repeat(n) {
                sb.append("#")
            }

            sb.append("\n\n")
        }
    }

    print(sb)
}