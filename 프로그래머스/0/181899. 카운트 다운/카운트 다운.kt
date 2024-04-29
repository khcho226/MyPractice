class Solution {
    fun solution(start: Int, end_num: Int): IntArray {
        return IntArray(start - end_num + 1) { start - it }
    }
}