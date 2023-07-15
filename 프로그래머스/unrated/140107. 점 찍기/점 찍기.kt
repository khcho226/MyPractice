import kotlin.math.*

class Solution {
    fun solution(k: Int, d: Int): Long {
        var answer = 0L

        for (x in 0..d step(k)) {
            answer += sqrt(d.toDouble().pow(2) - x.toDouble().pow(2)).toLong() / k + 1
        }

        return answer
    }
}