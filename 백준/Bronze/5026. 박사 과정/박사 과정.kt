import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        readLine().also { line ->
            sb.append(
                if (line == "P=NP") {
                    "skipped\n"
                } else {
                    val list = line.split("+")
                    
                    "${list[0].toInt() + list[1].toInt()}\n"
                }
            )
        }
    }

    print(sb)
}