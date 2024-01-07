import java.util.*
import kotlin.collections.*

class Solution {
    fun solution(arrows: IntArray): Int {
        val que: Queue<IntArray> = LinkedList()
        val dirs = arrayOf(
            intArrayOf(-1, 0), intArrayOf(-1, 1), intArrayOf(0, 1), intArrayOf(1, 1),
            intArrayOf(1, 0), intArrayOf(1, -1), intArrayOf(0, -1), intArrayOf(-1, -1)
        )
        val set1 = HashSet<String>()
        val set2 = HashSet<String>()
        var next: IntArray
        var now = intArrayOf(0, 0)
        var answer = 0

        que.offer(now)

        arrows.forEach { arrow ->
            repeat(2) {
                next = intArrayOf(now[0] + dirs[arrow][0], now[1] + dirs[arrow][1])
                now = next
                que.offer(next)
            }
        }

        now = que.poll()
        set1.add("${now[0]} ${now[1]}")

        while (que.isNotEmpty()) {
            next = que.poll()

            val sNext = "${next[0]} ${next[1]}"
            val sNow = "${now[0]} ${now[1]}"

            if (set1.contains(sNext) && set2.contains("$sNow $sNext").not()) {
                answer++
            } else {
                set1.add(sNext)
            }

            set2.add("$sNow $sNext")
            set2.add("$sNext $sNow")
            now = next
        }

        return answer
    }
}