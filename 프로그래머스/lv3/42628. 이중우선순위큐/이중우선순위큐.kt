import java.util.*

class Solution {
    fun solution(operations: Array<String>): IntArray {
        val minQue = PriorityQueue<Int>()
        val maxQue = PriorityQueue<Int>(Collections.reverseOrder())
        
        operations.map { it.split(" ") }.forEach {
            if (it[0] == "I") {
                minQue.add(it[1].toInt())
                maxQue.add(it[1].toInt())
                return@forEach
            }
            
            if (minQue.isNotEmpty()) {
                if (it[1] == "1") {
                    minQue.remove(maxQue.poll())
                } else {
                    maxQue.remove(minQue.poll())
                }
            }
        }
        
        return if (minQue.isNotEmpty()) {
            intArrayOf(maxQue.poll(), minQue.poll())
        } else {
            IntArray(2)
        }
    }
}