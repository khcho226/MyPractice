class Solution {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        
        return maxOf(numbers[0] * numbers[1], numbers[numbers.size - 1] * numbers[numbers.size - 2])
    }
}