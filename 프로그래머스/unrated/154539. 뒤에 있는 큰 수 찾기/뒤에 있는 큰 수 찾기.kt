import java.util.*

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val stack = Stack<Pair<Int, Int>>()
        val arr = IntArray(numbers.size) { -1 }
        
        numbers.forEachIndexed { idx, it -> 
            while (stack.isNotEmpty() && stack.peek().second < it) {
                arr[stack.pop().first] = it
            }

            stack.push(Pair(idx, it))
        }
        
        return arr
    }
}