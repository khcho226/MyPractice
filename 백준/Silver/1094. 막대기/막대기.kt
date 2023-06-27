import java.util.*

fun main() {
    val x = readLine()!!.toInt()
    val que = PriorityQueue<Int>().also {
        it.add(64)
    }

    while (x != que.sum()) {
        (que.poll() / 2).also {
            que.add(it)

            if (x > que.sum()) {
                que.add(it)
            }
        }
    }

    println(que.size)
}