class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        return numlist.toList().filter { it % n == 0 }.toIntArray()
    }
}