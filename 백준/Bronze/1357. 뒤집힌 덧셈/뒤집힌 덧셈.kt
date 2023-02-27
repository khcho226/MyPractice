import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).run {
    val (x, y) = readLine().split(" ").map { it.toInt() }

    print(rev(rev(x) + rev(y)))
}

fun rev(input: Int): Int = input.toString().reversed().toInt()