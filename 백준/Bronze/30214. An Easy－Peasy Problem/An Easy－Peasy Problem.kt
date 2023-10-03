import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    
    print(
        if (a >= (b + 1) / 2) {
            "E"
        } else {
            "H"
        }
    )
}