import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val stack = Stack<Int>()
    val arr = IntArray(20) { it + 1 }

    repeat(10) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt() - 1
        val b = token.nextToken().toInt() - 1

        for (i in a..b) {
            stack.push(arr[i])
        }

        for (i in a..b) {
            arr[i] = stack.pop()
        }
    }

    arr.forEach {
        print("$it ")
    }
}