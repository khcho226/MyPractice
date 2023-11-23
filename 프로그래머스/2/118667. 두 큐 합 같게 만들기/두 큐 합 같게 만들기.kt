import java.util.*

class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val que1: Queue<Long> = LinkedList(queue1.map { it.toLong() })
        val que2: Queue<Long> = LinkedList(queue2.map { it.toLong() })
        val total = queue1.size * 4
        var cnt = 0
        var sum1 = que1.sum()
        var sum2 = que2.sum()

        while (total >= cnt) {
            if (sum1 == sum2) {
                return cnt
            }

            if (sum1 > sum2) {
                que1.poll().also {
                    que2.offer(it)
                    sum1 -= it
                    sum2 += it
                }
            } else {
                que2.poll().also {
                    que1.offer(it)
                    sum1 += it
                    sum2 -= it
                }
            }

            cnt++
        }

        return -1
    }
}