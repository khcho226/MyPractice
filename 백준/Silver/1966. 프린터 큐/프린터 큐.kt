import java.util.*

fun main() {
    repeat(readLine()!!.toInt()) {
        val (_, m) = readLine()!!.split(" ").map { it.toInt() }
        val que: Queue<Pair<Int, String>> = LinkedList()
        val priQue: PriorityQueue<String> = PriorityQueue(reverseOrder())
        var cnt = 0

        readLine()!!.split(" ").forEachIndexed { idx, it ->
            que.add(Pair(idx, it))
            priQue.add(it)
        }

        while (que.isNotEmpty()) {
            val task = que.poll()

            if (task.second == priQue.peek()) {
                priQue.poll()
                cnt++

                if (task.first == m) {
                    break
                }
            } else {
                que.add(task)
            }
        }

        println(cnt)
    }
}