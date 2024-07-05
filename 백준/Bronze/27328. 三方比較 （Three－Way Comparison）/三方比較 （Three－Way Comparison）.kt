import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val a = readLine().toInt()
    val b = readLine().toInt()
    
    print(
        if (a > b) {
            1
        } else if  (a == b) {
            0
        } else {
            -1
        }
    )
}