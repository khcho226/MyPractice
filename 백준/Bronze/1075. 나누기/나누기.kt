import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val n = readLine()
    val f = readLine().toInt()

    loop@ for (i in 0..9) {
        for (j in 0..9) {
            val x = "$i$j"

            if ((n.substring(0, n.length - 2) + x).toInt() % f == 0) {
                println(x)
                break@loop
            }
        }
    }
}
