import java.util.*
import kotlin.collections.HashSet
import kotlin.math.abs

class Solution {
    lateinit var arr: Array<MutableList<Int>>

    fun solution(n: Int, wires: Array<IntArray>): Int {
        var ans = n

        arr = Array(n) { mutableListOf() }
        wires.forEach {
            arr[it[0] - 1].add(it[1] - 1)
            arr[it[1] - 1].add(it[0] - 1)
        }
        wires.forEach { ans = minOf(ans, abs(2 * bfs(it[0] - 1, it[1] - 1) - n)) }

        return ans
    }

    fun bfs(start: Int, end: Int): Int {
        val list = arrayListOf(start)
        val que: Queue<Int> = LinkedList()

        arr[start].filter { it != end }.let {
            list.addAll(it)
            que.addAll(it)
        }

        while (que.isNotEmpty()) {
            arr[que.poll()].filter { list.contains(it).not() }.let {
                list.addAll(it)
                que.addAll(it)
            }
        }

        return list.size
    }
}