class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var total = 0
        var idx = 0
        
        while (total <= n) {
            total += numbers[idx++]
        }
        
        return total
    }
}