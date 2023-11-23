import kotlin.collections.*

class Solution {
    fun solution(rc: Array<IntArray>, operations: Array<String>): Array<IntArray> {
        val left = ArrayDeque<Int>()
        val mid = ArrayDeque<ArrayDeque<Int>>()
        val right = ArrayDeque<Int>()
        val answer = rc

        for (i in rc.indices) {
            val temp = ArrayDeque<Int>()

            for (j in rc[i].indices) {
                when (j) {
                    0 -> left.addLast(rc[i][j])
                    rc[i].size - 1 -> right.addLast(rc[i][j])
                    else -> temp.addLast(rc[i][j])
                }
            }

            mid.addLast(temp)
        }

        operations.forEach {
            if (it == "ShiftRow") {
                left.addFirst(left.removeLast())
                mid.addFirst(mid.removeLast())
                right.addFirst(right.removeLast())
            } else {
                mid.first().addFirst(left.removeFirst())
                right.addFirst(mid.first().removeLast())
                mid.last().addLast(right.removeLast())
                left.addLast(mid.last().removeFirst())
            }
        }

        for (i in rc.indices) {
            val temp = mid.removeFirst()
            var j = 1

            while (temp.isNotEmpty()) {
                answer[i][j++] = temp.removeFirst()
            }

            answer[i][0] = left.removeFirst()
            answer[i][j] = right.removeFirst()
        }

        return answer
    }
}