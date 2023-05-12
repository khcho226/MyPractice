import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val bridge: Queue<Int> = LinkedList(List(bridge_length) { 0 })
        val waiting: Queue<Int> = LinkedList(truck_weights.toList())
        var time = 0
        var total = 0

        while (bridge.isNotEmpty()) {
            time++
            total -= bridge.poll()

            if (waiting.isNotEmpty()) {
                if (total + waiting.peek() <= weight) {
                    total += waiting.peek()
                    bridge.add(waiting.poll())
                } else {
                    bridge.add(0)
                }
            }
        }

        return time
    }
}