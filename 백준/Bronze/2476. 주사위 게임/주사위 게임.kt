import java.util.*

fun main() {
    val arr = arrayListOf<Int>()

    repeat(readLine()!!.toInt()) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken().toInt()

        arr.add(
            when {
                a == b && b == c -> 10000 + a * 1000
                a == b -> 1000 + a * 100
                b == c -> 1000 + b * 100
                c == a -> 1000 + c * 100
                else -> maxOf(a, b, c) * 100
            }
        )
    }

    print(arr.max())
}