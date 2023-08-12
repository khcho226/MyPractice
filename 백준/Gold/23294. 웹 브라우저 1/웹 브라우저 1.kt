import java.util.*
import kotlin.collections.*

fun main() = with(System.`in`.bufferedReader()) {
    val token = StringTokenizer(readLine())
    val n = token.nextToken().toInt()
    val q = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    val back = ArrayDeque<Int>()
    val front = ArrayDeque<Int>()
    var arr: IntArray
    var now = 0
    var cache = 0

    StringTokenizer(readLine()).also { st ->
        arr = IntArray(1) + IntArray(n) { st.nextToken().toInt() }
    }

    repeat(q) {
        val ex = readLine()

        when (ex[0]) {
            'A' -> {
                while (front.isNotEmpty()) {
                    cache -= arr[front.removeFirst()]
                }

                if (now != 0) {
                    back.addFirst(now)
                }

                ex.substring(2).toInt().also {
                    now = it
                    cache += arr[it]
                }

                while (cache > c) {
                    cache -= arr[back.removeLast()]
                }
            }
            'B' -> {
                if (back.isNotEmpty()) {
                    front.addFirst(now)
                    now = back.removeFirst()
                }
            }
            'F' -> {
                if (front.isNotEmpty()) {
                    back.addFirst(now)
                    now = front.removeFirst()
                }
            }
             else -> {
                 var idx = 1

                 while (idx < back.size) {
                     if (back[idx] == back[idx - 1]) {
                         cache -= arr[back.removeAt(idx--)]
                     }

                     idx++
                 }
             }
        }
    }

    println(now)
    println(
        if (back.isNotEmpty()) {
            back.joinToString(" ")
        } else {
            -1
        }
    )
    println(
        if (front.isNotEmpty()) {
            front.joinToString(" ")
        } else {
            -1
        }
    )
}