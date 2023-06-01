import java.util.*

fun main() {
    val token = StringTokenizer(readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    val d = token.nextToken().toInt()
    val e = token.nextToken().toInt()
    val f = token.nextToken().toInt()
    val x = (b * f - c * e) / (b * d - a * e)
    val y = (a * f - c * d) / (a * e - b * d)
    
    print("$x $y")
}