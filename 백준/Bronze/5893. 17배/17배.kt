import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    print((readLine().toBigInteger(2) * 17.toBigInteger()).toString(2))
}