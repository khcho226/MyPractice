import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val s = readLine().toInt()
    val m = readLine().toInt()
    val l = readLine().toInt()
    
    print(
        if (s + m * 2 + l * 3 >= 10) {
            "happy"
        } else {
            "sad"
        }
    )
}