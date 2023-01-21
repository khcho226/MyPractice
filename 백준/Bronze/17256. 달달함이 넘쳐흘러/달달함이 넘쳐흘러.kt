import java.io.*
import java.util.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val aToken = StringTokenizer(readLine())
    val aX = aToken.nextToken().toInt()
    val aY = aToken.nextToken().toInt()
    val aZ = aToken.nextToken().toInt()

    val cToken = StringTokenizer(readLine())
    val cX = cToken.nextToken().toInt()
    val cY = cToken.nextToken().toInt()
    val cZ = cToken.nextToken().toInt()

    print("${cX - aZ} ${cY / aY} ${cZ - aX}")
}