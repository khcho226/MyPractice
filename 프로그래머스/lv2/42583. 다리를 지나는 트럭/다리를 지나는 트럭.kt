import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val bridge: Queue<Int> = LinkedList(List(bridge_length) { 0 })
        val waiting: Queue<Int> = LinkedList(truck_weights.toList())
        var answer = 0
        
        while (bridge.isNotEmpty()) {
            answer++
            bridge.poll()
            
            if (waiting.isNotEmpty()) {
                if (bridge.sum() + waiting.peek() <= weight) {
                    bridge.add(waiting.poll())
                } else {
                    bridge.add(0)
                }
            }
        }
        
        return answer
    }
}