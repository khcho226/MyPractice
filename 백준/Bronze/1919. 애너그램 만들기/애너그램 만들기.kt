import kotlin.math.*

fun main() {
    val arr = IntArray(26)

    readLine()!!.forEach { arr[it - 'a'] += 1 }
    readLine()!!.forEach { arr[it - 'a'] -= 1 }
    println(arr.fold(0) { acc, it -> acc + abs(it) })
}