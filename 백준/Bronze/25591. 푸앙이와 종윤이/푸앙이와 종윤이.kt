import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val x = token.nextToken().toInt()
    val y = token.nextToken().toInt()
    val a = 100 - x
    val b = 100 - y
    val c = 100 - a - b
    val d = a * b
    val q = d / 100
    val r = d % 100

    print("$a $b $c $d $q $r\n${c + q} $r")
}