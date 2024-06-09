import java.util.*

class Solution {
    fun solution(arr: IntArray): IntArray {
        val stk = Stack<Int>()
        
        arr.forEach {
            while (stk.isNotEmpty() && stk.peek() >= it) {
                stk.pop()
            }
            
            stk.push(it)
        }
        
        return stk.toIntArray()
    }
}