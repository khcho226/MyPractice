import java.util.*

class Solution {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
        val dStack = Stack<Pair<Int, Int>>()
        val pStack = Stack<Pair<Int, Int>>()
        var answer = 0L

        deliveries.forEachIndexed { idx, i ->
            if (i != 0) {
                dStack.push(Pair(idx + 1, i))
            }
        }

        pickups.forEachIndexed { idx, i ->
            if (i != 0) {
                pStack.push(Pair(idx + 1, i))
            }
        }

        while (dStack.isNotEmpty() || pStack.isNotEmpty()) {
            val dIdx = if (dStack.isNotEmpty()) dStack.peek().first else 0
            val pIdx = if (pStack.isNotEmpty()) pStack.peek().first else 0
            var cnt = cap

            answer += maxOf(dIdx, pIdx) * 2

            while (dStack.isNotEmpty() && cnt > 0) {
                dStack.pop().also {
                    if (it.second > cnt) {
                        dStack.push(Pair(it.first, it.second - cnt))
                    }

                    cnt -= it.second
                }
            }

            cnt = cap

            while (pStack.isNotEmpty() && cnt > 0) {
                pStack.pop().also {
                    if (it.second > cnt) {
                        pStack.push(Pair(it.first, it.second - cnt))
                    }

                    cnt -= it.second
                }
            }
        }

        return answer
    }
}