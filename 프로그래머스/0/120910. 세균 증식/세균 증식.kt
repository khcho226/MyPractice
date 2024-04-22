class Solution {
    fun solution(n: Int, t: Int): Int {
        var total = n
        
        repeat(t) {
            total *= 2
        }
        
        return total
    }
}