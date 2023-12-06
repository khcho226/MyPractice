import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    repeat(15) {
        StringTokenizer(readLine()).also { st ->
            repeat(15) {
                st.nextToken().also {
                    if (it == "w") {
                        print("chunbae")
                        return@run
                    } else if (it == "b") {
                        print("nabi")
                        return@run
                    } else if (it == "g") {
                        print("yeongcheol")
                        return@run
                    }
                }
            }
        }
    }
}