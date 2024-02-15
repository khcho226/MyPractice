import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    var total = 0
    
    repeat(readLine().toInt()) {
        total += readLine().toInt()
    }

    print(total)
}