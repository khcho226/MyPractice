class Solution {
    fun solution(array: IntArray): Int {
        return array.fold(0) { total, now ->
            total + now.toString().count { it == '7' }
        }
    }
}