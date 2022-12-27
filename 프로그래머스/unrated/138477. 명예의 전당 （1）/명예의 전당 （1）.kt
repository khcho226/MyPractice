import java.util.*

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val que = PriorityQueue<Int>()
        var answer: IntArray = intArrayOf()
        
        score.forEach {
            que.add(it)
            
            if (que.size > k) {
                que.poll()
            }
            
            answer = answer.plus(que.first())
        }
        
        return answer
    }
}