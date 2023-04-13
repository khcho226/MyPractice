import kotlin.math.*

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val arr = progresses.mapIndexed { idx, it -> ceil((100 - it).toDouble() / speeds[idx]) }
        var answer = intArrayOf()
        var max = arr.first()
        var cnt = 0

        arr.forEach {
            if (it > max) {
                answer = answer.plus(cnt)
                max = it
                cnt = 1
            } else {
                cnt++
            }
        }

        return answer.plus(cnt)
    }
}